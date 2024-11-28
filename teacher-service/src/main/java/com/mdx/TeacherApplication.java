package com.mdx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * TODO
 *
 * @Description
 * @Author Administrator
 * @Date 2024/4/16 13:52
 **/

@SpringBootApplication
@EnableFeignClients
public class TeacherApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class,args);
    }

}
