package com.matmazur.timeregistratordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class TimeRegistratorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeRegistratorDemoApplication.class, args);
    }
}

