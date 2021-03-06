/**
 * High-Speed Service Framework (HSF)
 * 
 */
package com.galaxy.hsf.event;

import com.galaxy.hsf.common.exception.HSFException;

/**
 * HSF 贯彻其运行期 发布期事件管理
 * @author sihai
 *
 */
public interface HSFEventListener {
	
	public static final String SERVICE_ADDRESSES_ARRIVED = "service_addresses_arrived";
	
	public static final String SERVICE_ROUTE_ARRIVED = "service_route_arrived";
	
	public static final String ALL_AVALIABLE_ADDRESSES = "all_avaliable_addresses";
	
	public static final String HSF_REAL_INVOKE_ADDRESS = "hsf_real_invoke_address";
	
	public static final String HSF_SELECT_INVOKE_ADDRESS = "hsf_select_invoke_address";
	
	public static final String HSF_BEFORE_REMOTE_INVOKE = "hsf_before_remote_invoke";
	
	public static final String HSF_AFTER_REMOTE_INVOKE = "hsf_after_remote_invoke";
	
	public static final String HSF_BEFORE_HANDLE_REQUEST = "hsf_before_handle_request";
	
	public static final String HSF_AFTER_HANDLE_REQUEST = "hsf_after_handle_request";
	
	/**
	 * 参数eventObject在以下事件中代表的参数如下：
	   <lu>
	     <li>1. SERVICE_ADDRESSES_ARRIVED情况下为List&lt;Object&gt;,其中object为String类型。</li>
	     <li>2. ALL_AVALIABLE_ADDRESSES情况下为List&lt;List&lt;String&gt;&gt;。</li>
	     <li>3. HSF_REAL_INVOKE_ADDRESS情况下为String。</li>
	     <li>4. HSF_SELECT_INVOKE_ADDRESS情况下为String。</li>
	     <li>5. HSF_BEFORE_REMOTE_INVOKE情况下为<tt>HSFRequest</tt></li>
	     <li>6. HSF_BEFORE_HANDLE_REQUEST情况下为HSFRequest</li>
	     <li>7. HSF_AFTER_HANDLE_REQUEST情况下为HSFResponse</tt></li>
	     <li>8. HSF_AFTER_REMOTE_INVOKE情况下为HSFRequest</tt></li>
	   </lu>
	 * @param event
	 * @throws HSFException
	 */
	public void onEvent(HSFEvent event) throws HSFException; 
}
