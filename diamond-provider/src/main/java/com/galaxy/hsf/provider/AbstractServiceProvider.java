/**
 * High-Speed Service Framework (HSF)
 * 
 */
package com.galaxy.hsf.provider;

import com.galaxy.hsf.common.lifecycle.AbstractLifeCycle;
import com.galaxy.hsf.metadata.ServiceMetadata;

/**
 * 
 * @author sihai
 *
 */
public abstract class AbstractServiceProvider extends AbstractLifeCycle implements ServiceProvider {

	/**
	 * 
	 */
	protected ServiceMetadata metadata = new ServiceMetadata();

	/**
	 * 
	 * @param metadata
	 */
	public AbstractServiceProvider(ServiceMetadata metadata) {
		this.metadata = metadata;
	}
	
	@Override
	public ServiceMetadata getMetadata() {
		return metadata;
	}	
	
}
