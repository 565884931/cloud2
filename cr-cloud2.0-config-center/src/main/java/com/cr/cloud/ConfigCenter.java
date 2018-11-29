/**
 * 
 */
/**
 * Copyright 2018 China Renaissance Inc.
 */	
package com.cr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author VULCAN
 *
 */
@SpringBootApplication  
@EnableConfigServer  
@EnableDiscoveryClient
public class ConfigCenter {
	//http://localhost:8881/cr-cloud-config-center-dev.properties
		public static void main(String[] args) {
			args = new String[1];
			args[0] = "--spring.profiles.active=dev";
			SpringApplication.run(ConfigCenter.class, args);
		}
}
