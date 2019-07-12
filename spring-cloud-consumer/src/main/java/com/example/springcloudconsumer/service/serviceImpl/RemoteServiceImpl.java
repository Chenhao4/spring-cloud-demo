package com.example.springcloudconsumer.service.serviceImpl;

import com.example.springcloudconsumer.service.RemoteService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class RemoteServiceImpl implements RemoteService {

    @Override
    public String helloRemote(@RequestParam("name")String name){
        return "error, service is unconnected hello ";
    }

    @Override
    public String worldRemote(){
        return "error, service is unconnected world ";
    }
}
