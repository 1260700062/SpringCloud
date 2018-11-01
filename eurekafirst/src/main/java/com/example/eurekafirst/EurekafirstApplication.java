package com.example.eurekafirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//EnableEurekaClient有@EnableDiscoveryClient的功能，只适用于服务采用eureka作为注册中心的时候，使用场景较为单一
@EnableDiscoveryClient
@EnableEurekaClient

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class EurekafirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekafirstApplication.class, args);
	}
}
