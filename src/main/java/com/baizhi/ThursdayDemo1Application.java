package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
@SpringBootApplication
@MapperScan("com.baizhi.mapper")
public class ThursdayDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(ThursdayDemo1Application.class, args);
    }
}

