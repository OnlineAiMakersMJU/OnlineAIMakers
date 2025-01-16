package com.example.study;

import com.example.study.ethereum.service.EthereumService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    @Autowired
    private EthereumService ethereumService;

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

}
