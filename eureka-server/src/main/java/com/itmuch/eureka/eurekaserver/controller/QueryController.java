package com.itmuch.eureka.eurekaserver.controller;

import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Resource
    private EurekaClientConfigBean eurekaClientConfigBean;

    @GetMapping("/eureka-server")
    public Object getEurekaServerUrl() {
        return eurekaClientConfigBean.getServiceUrl();
    }
}
