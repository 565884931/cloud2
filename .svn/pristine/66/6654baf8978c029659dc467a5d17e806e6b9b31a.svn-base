package com.cr.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "--spring.profiles.active=dev";
		new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);
	}

}
