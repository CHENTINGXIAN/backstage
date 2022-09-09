package com.example.backstage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan(basePackages = {"com.example.backstage.config"})
@RestController
@SpringBootApplication
//@EnableOpenApi
public class BackstageApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackstageApplication.class, args);
    }


}
