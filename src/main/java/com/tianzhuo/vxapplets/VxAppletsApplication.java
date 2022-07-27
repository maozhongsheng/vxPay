package com.tianzhuo.vxapplets;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tianzhuo.vxapplets.mapper")
@SpringBootApplication
public class VxAppletsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VxAppletsApplication.class, args);
    }

}
