package com.cr.cloud.http;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * Created by huangrongyou@yixin.im on 2017/11/13.
 */
@Service
public class MyHystrixClient {
    @Autowired
    private RestTemplate restTemplate;
    
    // 调用超时时间 @HystrixProperty
    @HystrixCommand(fallbackMethod = "myFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    public String simpleHystrixClientCall(long time) {
        return restTemplate.getForEntity("http://CLOUD-HYSTRIX-SERVICE/hystrix/simple?time=" + time, String.class).getBody();
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
