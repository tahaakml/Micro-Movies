package com.abdo.recommandationms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableMongoAuditing
public class RecommandationMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecommandationMsApplication.class, args);
    }

}
