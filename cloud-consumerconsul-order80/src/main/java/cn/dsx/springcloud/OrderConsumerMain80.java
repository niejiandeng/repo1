package cn.dsx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname: OrderConsumerMain80
 * @Author: Dsx
 * @Date: 2020/04/12/20:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerMain80.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate (){
        return new RestTemplate();
    }

}
