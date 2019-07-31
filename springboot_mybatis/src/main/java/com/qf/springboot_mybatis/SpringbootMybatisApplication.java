package com.qf.springboot_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.springboot_mybatis.mapper")
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
        /*Integer i3 = 126;
        Integer i4 = 126;
        int i5 = 126;
        System.out.println(i3 == i4);
        System.out.println(i3 == i5);
        Integer i6 = 128;
        Integer i7 = 128;
        int i8 = 128;
        System.out.println(i6 == i7);
        System.out.println(i6 == i8);
        int i9 = 128;
        int i10 = 128;
        System.out.println(i9 == i10);*/
        //System.out.println(i6 == i8);
    }

}
