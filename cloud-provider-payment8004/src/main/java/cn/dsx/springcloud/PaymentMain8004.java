package cn.dsx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname: PaymentMain8004
 * @Author: Dsx
 * @Date: 2020/04/12/19:58
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
/**
 [zk: localhost:2181(CONNECTED) 0] ls /
 [zookeeper]
 [zk: localhost:2181(CONNECTED) 1] ls /
 [services, zookeeper]
 [zk: localhost:2181(CONNECTED) 2] ls /services
 [cloud-provider-payment]
*/