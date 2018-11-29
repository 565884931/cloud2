package cr.cloud;



import java.util.HashMap;
import java.util.Map.Entry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;



@SpringBootApplication
@EnableAdminServer  //激活sba
@EnableDiscoveryClient
public class BootAdminServer extends SpringBootServletInitializer {

	 @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(BootAdminServer.class);  
    }  

	 
	 public static void main(String[] args) throws Exception {
			args = new String[1];
			args[0] = "--spring.profiles.active=dev";
	        SpringApplication.run(BootAdminServer.class, args);
	 }




	
}
