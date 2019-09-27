package com.yt.spring.cloud.eureka.service.hi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 提供服务
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceHiApplication.class, args);
    }

}
