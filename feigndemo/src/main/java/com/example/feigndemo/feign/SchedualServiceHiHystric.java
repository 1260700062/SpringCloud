package com.example.feigndemo.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignService {

    @Override
    public String logining(String name) {
        return "It works";
    }

}
