package com.carnet.route_fence.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.carnet.route_fence.client")
public class RouteFenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RouteFenceApplication.class, args);
    }
}
