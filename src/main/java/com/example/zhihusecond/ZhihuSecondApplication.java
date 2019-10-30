package com.example.zhihusecond;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.zhihusecond.dao")
public class ZhihuSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuSecondApplication.class, args);
    }

}
