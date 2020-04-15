package springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname: PaymentMain9001
 * @Author: Dsx
 * @Date: 2020/04/15/10:08
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}

