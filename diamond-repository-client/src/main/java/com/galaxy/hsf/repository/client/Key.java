/**
 * High-Speed Service Framework (HSF)
 * 
 */
package com.galaxy.hsf.repository.client;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

/**
 * Key of data
 * @author sihai
 *
 */
public class Key implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1171314496745268310L;
	
	public static final String NAMESPACE_KEY_SEPARATOR = ":";
	public static final String ERROR_MSG = String.format("namespace or key must not contains separator of namespace and key:%s ", NAMESPACE_KEY_SEPARATOR);
	
	/**
	 * 
	 */
	private String namespace;
	
	/**
	 * 
	 */
	private String key;
	
	
	public Key() {}
	
	public Key(String namespace, String key) {
		if(namespace.contains(NAMESPACE_KEY_SEPARATOR) || key.contains(NAMESPACE_KEY_SEPARATOR)) {
			throw new IllegalArgumentException(ERROR_MSG);
		}
		this.namespace = namespace;
		this.key = key;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		if(namespace.contains(NAMESPACE_KEY_SEPARATOR)) {
			throw new IllegalArgumentException(ERROR_MSG);
		}
		this.namespace = namespace;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		if(key.contains(NAMESPACE_KEY_SEPARATOR)) {
			throw new IllegalArgumentException(ERROR_MSG);
		}
		this.key = key;
	}
	
	public String getFullKey() {
		return String.format("%s:%s", namespace, key);
	}
	
	public void setFullKey(String fullKey) {
		String[] tmp = fullKey.split(NAMESPACE_KEY_SEPARATOR);
		this.namespace = tmp[0];
		this.key = tmp[1];
	}
	
	@Override
	public int hashCode() {
		return String.format("%s.%s", namespace, key).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) {
			return true;
		}
		
		if(null == obj) {
			return false;
		}
		
		return StringUtils.equals(namespace, ((Key)obj).namespace) && StringUtils.equals(key, ((Key)obj).key);
	}
}
