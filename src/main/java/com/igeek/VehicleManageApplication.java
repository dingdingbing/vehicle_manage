package com.igeek;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.igeek.mapper")
public class VehicleManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleManageApplication.class, args);
    }

}
