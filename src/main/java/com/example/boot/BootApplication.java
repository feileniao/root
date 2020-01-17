package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @RequestMapping("test")
    public String get(){
        System.out.println("55555555");
        System.out.println("55555555");
        System.out.println("55555555");
        System.out.println("55555555");
        System.out.println("55555555");
        System.out.println("345");
        return "boot test";
    }

}
