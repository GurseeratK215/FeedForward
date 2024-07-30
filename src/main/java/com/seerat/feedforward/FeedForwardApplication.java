package com.seerat.feedforward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeedForwardApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeedForwardApplication.class, args);
        try {
            System.out.print("hi");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
