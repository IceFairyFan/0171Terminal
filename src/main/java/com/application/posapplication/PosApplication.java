package com.application.posapplication;

import com.application.posapplication.model.Blog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.application.posapplication.controller.TestController;

import java.util.List;

@SpringBootApplication
public class PosApplication {

    public static void main(String[] args) {

        SpringApplication.run(PosApplication.class, args);
        System.out.println("Test Run.");

    }

}
