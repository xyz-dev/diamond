/**
 * High-Speed Service Framework (HSF)
 * 
 */
package com.galaxy.hsf.metadata;

import java.io.Serializable;

/**
 * 
 * @author sihai
 *
 */
public class MethodSpecial implements Serializable {

	public static final String left = "[";
	public static final String right = "]";
	public static final String equal = "=";
	public static final String split = "#";
	
	private static final String KEY_TIMEOUT = "clientTimeout";
    
	/**
	 * 方法名称
	 */
	private String methodName;
	
	/**
     * 默认客户端调用超时时间：3000ms
     */
    private long clientTimeout = 3000;

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public long getClientTimeout() {
		return clientTimeout;
	}

	public void setClientTimeout(long clientTimeout) {
		this.clientTimeout = clientTimeout;
	}
	
	public static MethodSpecial parseMethodSpecial(String str) {
        int idx_split = str.indexOf(split); // "#"被认为是MethodSpecial配置的标志
        if (idx_split < 0) {
            return null;
        }

        int idx_equal = str.indexOf(equal);
        int idx_leftLeft = str.indexOf(left);
        int idx_leftRight = str.indexOf(right);
        int idx_rightLeft = str.indexOf(left, idx_equal);
        int idx_rightRight = str.indexOf(right, idx_equal);

        String methodName = str.substring(idx_leftLeft + 1, idx_leftRight);
        String key = str.substring(idx_rightLeft + 1, idx_split);
        String value = str.substring(idx_split + 1, idx_rightRight);

        MethodSpecial special = new MethodSpecial();
        special.setMethodName(methodName);
        if (KEY_TIMEOUT.equals(key)) {
            special.setClientTimeout(Long.parseLong(value));
        }
        return special;
    }
}