package com.cr.cloud.http.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cr.cloud.http.client.ExternalPersonService;
import com.cr.cloud.http.client.MyHystrixClient;


/**
 * Created by huangrongyou@yixin.im on 2017/11/13.
 */
@RestController
public class SimpleCtl {
    @Autowired
    private MyHystrixClient myHystrixClient;
    
    @Autowired
    private ExternalPersonService externalPersonService;

    @RequestMapping(value="/hystrix/simple")
    public String simpleClientCall(){
        return "rsp: " + myHystrixClient.simpleHystrixClientCall(System.currentTimeMillis());
    }
    
    @RequestMapping(value="/hystrix")
    public String hystrix(){
        return externalPersonService.findPerson();
    }
    
    @RequestMapping(value="/hystrix/name/{id}")
    public String hystrixs(@PathVariable("id") String id){
        return id;
    }

}
