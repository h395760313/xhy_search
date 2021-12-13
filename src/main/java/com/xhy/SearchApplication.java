package com.xhy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiehongyu
 * @date 2021/12/13 17:39
 */
@SpringBootApplication
@MapperScan(value = "com.xhy")
public class SearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class,args);
    }
}
