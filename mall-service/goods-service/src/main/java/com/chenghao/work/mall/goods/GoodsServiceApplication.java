package com.chenghao.work.mall.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenghao
 */
@SpringBootApplication
@MapperScan(basePackages = "com.chenghao.work.mall.goods.mapper")
@EnableDiscoveryClient
public class GoodsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApplication.class,args);
    }
}
