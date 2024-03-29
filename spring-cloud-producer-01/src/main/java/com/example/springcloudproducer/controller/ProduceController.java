package com.example.springcloudproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/world")
    public String world() {
        return "Hello ted";
    }
}
