package com.example.feigndemo.Controller;

import com.example.feigndemo.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class LoginController {

    @Autowired
    private FeignService feignService;

    @GetMapping("login")
    public String login(String name){
        return feignService.logining(name);
    }

}
