package com.example.pongservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import proto.PongServiceGrpc;

@SpringBootApplication
public class PongServiceApplication {
    
    public static void main(String[] args) {
        System.out.println("kva");
        
        SpringApplication.run(PongServiceApplication.class, args);
    }
    
}
