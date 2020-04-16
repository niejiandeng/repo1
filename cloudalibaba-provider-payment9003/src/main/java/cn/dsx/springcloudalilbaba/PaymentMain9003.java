package cn.dsx.springcloudalilbaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname: PaymentMain9003
 * @Author: Dsx
 * @Date: 2020/04/16/10:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9003.class, args);
    }
}
