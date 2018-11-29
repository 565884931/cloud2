package com.cr.cloud.http.client;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Created by huangrongyou@yixin.im on 2017/11/13.
 */
@Service
public class MyHystrixClient {
//    @Autowired
//    private RestTemplate restTemplate;
    
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
    
    // 调用超时时间 @HystrixProperty
    @HystrixCommand(fallbackMethod = "myFallback")
    public String simpleHystrixClientCall(long time) {
    	String  result =restTemplate().getForObject("http://CLOUD-CONSUMER-HYSTRIX-TWO/hystrix/test" + time, String.class);
        return result;
    }

    /**
     * 方法simpleHystrixClientCall的回退方法，可以指定将hystrix执行失败异常传入到方法中
     * @param p ystrix执行失败的传入方法的请求
     * @param e hystrix执行失败的异常对象
     * @return
     */
    String myFallback(long p, Throwable e) {
        return "Execute raw fallback: access service fail , req= " + p + " reason = " + e;
    }

//    String myFallback(Throwable ) {
//        return "Execute fallback: access service fail , reason = ";
//    }

}
