package cn.dsx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname: MainApp8401
 * @Author: Dsx
 * @Date: 2020/04/15/20:27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401{
    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class, args);
    }
}

