package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaRibbonJt3Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudEurekaRibbonJt3Application.class, args);

    }

}