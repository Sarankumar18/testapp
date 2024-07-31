package com.redhat.soloint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"com.redhat"})
@PropertySource(value = {"classpath:application.yml"})
public class SoloInt {
    public static void main(String[] args) {
        SpringApplication.run(SoloInt.class, args);
    }
}