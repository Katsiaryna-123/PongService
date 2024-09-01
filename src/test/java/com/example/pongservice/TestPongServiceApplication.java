package com.example.pongservice;

import org.springframework.boot.SpringApplication;

public class TestPongServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.from(PongServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }
    
}
