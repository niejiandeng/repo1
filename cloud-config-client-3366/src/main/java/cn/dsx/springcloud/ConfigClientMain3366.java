package cn.dsx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname: ConfigClientMain3366
 * @Author: Dsx
 * @Date: 2020/04/14/10:28
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366{
    public static void main(String[] args)    {
        SpringApplication.run(ConfigClientMain3366.class,args);
    }
}
