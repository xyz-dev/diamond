/**
 * High-Speed Service Framework (HSF)
 * 
 */
package com.galaxy.hsf.service;

import com.galaxy.hsf.common.lifecycle.LifeCycle;
import com.galaxy.hsf.metadata.ServiceMetadata;

/**
 * 
 * @author sihai
 *
 */
public interface ServiceSubscriber extends LifeCycle {

	/**
	 * 
	 * @param metadata
	 */
	void subscribe(ServiceMetadata metadata);
}
