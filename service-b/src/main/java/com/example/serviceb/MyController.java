package com.example.serviceb;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/hello-b/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name + " from service-b";
    }
}
