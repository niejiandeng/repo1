package cn.dsx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname: GateWayMain9527
 * @Author: Dsx
 * @Date: 2020/04/13/21:22
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527{
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
    }
}
