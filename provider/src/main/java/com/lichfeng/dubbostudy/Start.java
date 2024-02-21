package com.lichfeng.dubbostudy;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/2/20 15:23
 */
@SpringBootApplication
@EnableDubbo
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
}
