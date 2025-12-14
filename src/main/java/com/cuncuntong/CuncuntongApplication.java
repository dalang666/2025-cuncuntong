package com.cuncuntong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 村村通小程序后端服务启动类
 */
@SpringBootApplication
public class CuncuntongApplication {

    public static void main(String[] args) {
        SpringApplication.run(CuncuntongApplication.class, args);
        System.out.println("村村通后端服务启动成功");
    }
}