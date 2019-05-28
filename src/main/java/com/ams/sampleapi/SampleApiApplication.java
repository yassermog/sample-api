package com.ams.sampleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ams")
public class SampleApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SampleApiApplication.class, args);
    }
}

