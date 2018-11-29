/**
 * 
 */
/**
 * Copyright 2018 China Renaissance Inc.
 */	
package com.cr.cloud.http.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author VULCAN
 *
 */
@FeignClient(value = "CLOUD-CONSUMER-HYSTRIX-TWO", fallback = ExternalPersonServiceFallback.class)
public interface  ExternalPersonService {
		
	@RequestMapping(value = "/hystrix/test", method = RequestMethod.GET)
    public String findPerson();
}
