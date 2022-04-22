package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello Springboot";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greetings(){
        return "Hello Springboot from post";
    }
    
}
