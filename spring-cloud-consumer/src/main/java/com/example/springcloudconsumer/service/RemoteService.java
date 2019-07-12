package com.example.springcloudconsumer.service;

import com.example.springcloudconsumer.service.serviceImpl.RemoteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer", fallback = RemoteServiceImpl.class)
public interface RemoteService {

    @RequestMapping("/hello")
    public String helloRemote(@RequestParam("name")String name);

    @RequestMapping("/world")
    public String worldRemote();
}
