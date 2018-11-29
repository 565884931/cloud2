package com.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
public class ZuulServerApp {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "--spring.profiles.active=dev";
		new SpringApplicationBuilder(ZuulServerApp.class).web(true).run(args);
	}

}
