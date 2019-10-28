package com.offcn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.offcn.dao")
public class SbmApplication {

    public static void main(String[] args) {

        SpringApplication.run(SbmApplication.class, args);
    }

}
