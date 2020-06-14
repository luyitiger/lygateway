package com.luyigu.gmall.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
@MapperScan("com.luyigu.gmall.ums.dao")
public class GmallUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUmsApplication.class, args);
    }

}
