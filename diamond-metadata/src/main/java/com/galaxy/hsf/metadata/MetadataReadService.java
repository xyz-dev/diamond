/**
 * High-Speed Service Framework (HSF)
 * 
 */
package com.galaxy.hsf.metadata;

import com.galaxy.hsf.common.lifecycle.LifeCycle;


/**
 * 描述：发布服务元数据的服务
 * 
 * @author sihai
 *
 */
public interface MetadataReadService extends LifeCycle {
	
	/**
	 * 订阅服务元数据信息
	 * 
	 * @param metadata 元数据对象
	 */
	void subscriber(ServiceMetadata metadata);

}