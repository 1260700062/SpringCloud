package com.example.eurekafirst.Controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")
public class LoginController {

    @GetMapping("login")
    public String login(String name){
        return name + " login";
    }

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }

    @Scheduled(cron = "55 55 09 * * ? ")
    @GetMapping("aaaaaa")
    public String aaaaaaa(){
        return "aaaa";
    }



}
