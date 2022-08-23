package com.example.mysqlgeometrydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mysqlgeometrydemo.mapper")
public class MysqlGeometryDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlGeometryDemoApplication.class, args);
    }

}
