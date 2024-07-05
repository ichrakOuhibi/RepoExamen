package com.example.erukaexamen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ErukaExamenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErukaExamenApplication.class, args);
    }

}
