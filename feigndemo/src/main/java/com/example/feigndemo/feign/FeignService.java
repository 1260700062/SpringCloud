package com.example.feigndemo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//value为其他服务的服务名，fallback为容错处理，指定一个实现Feign接口并注入到Ioc容器的实现类
@FeignClient(value = "eurekafirst", fallback = SchedualServiceHiHystric.class)
public interface FeignService {

    @GetMapping("first/login")
    String logining(@RequestParam(name = "name") String name);

}
