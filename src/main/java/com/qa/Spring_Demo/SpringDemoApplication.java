package com.qa.Spring_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

//    @GetMapping("/hello")
//    public String greeting() {
//        return "Hello my Friends!";
//    }


    @GetMapping("/hi")
    public String greeting2() {
        return "Hello ALL my Friends!";
    }



}
