package com.example.springcloudconsumer.controller;

import com.example.springcloudconsumer.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteController {

    @Autowired
    RemoteService remoteService;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
//        System.out.println("in consumer");
        return remoteService.helloRemote(name);
    }

    @GetMapping("/world")
    public String world(){
//        System.out.println("in consumer");
        return remoteService.worldRemote();
    }
}
