package com.lichfeng.dubbostudy;


import com.lichfeng.dubbostudy.service.impl.UserTest;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

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
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Start.class, args);

        UserTest bean = applicationContext.getBean(UserTest.class);
        bean.doUserTest();
    }
}
