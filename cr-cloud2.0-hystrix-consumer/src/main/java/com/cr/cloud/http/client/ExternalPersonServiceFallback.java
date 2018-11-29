/**
 * 
 */
/**
 * Copyright 2018 China Renaissance Inc.
 */	
package com.cr.cloud.http.client;

import org.springframework.stereotype.Component;

/**
 * @author VULCAN
 *
 */
@Component
public class ExternalPersonServiceFallback implements ExternalPersonService{

	/* (non-Javadoc)
	 * @see com.cr.cloud.http.client.ExternalPersonService#findPerson()
	 */
	@Override
	public String findPerson() {
		// TODO Auto-generated method stub
		return "erro    调用错误";
	}

}
