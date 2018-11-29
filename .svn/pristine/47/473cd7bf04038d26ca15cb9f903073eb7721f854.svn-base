package com.cr.cloud;



import javax.servlet.http.HttpUtils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //需要手动刷新 http://127.0.0.1:8882/actuator/refresh   POST
public class ConfigGetInfo {

	//直接使用svn上的属性
	@Value("${test}")
	String test;
	
	//将svn 属性 赋值给yml 在进一步是从yml中取值
	@Value("${configTest.testYml}")
	String testYml;
	
	@GetMapping("/")
	public String getInfo(){
		return test;
	}
	
	@GetMapping("/getYml")
	public String getInfo1(){
		
		return testYml;
	}
}
