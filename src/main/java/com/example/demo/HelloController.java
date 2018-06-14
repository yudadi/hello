package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Hello() {
        Date date = new Date();
        System.out.println(date);
        return "Hello SpringBoot!";
    }
}
