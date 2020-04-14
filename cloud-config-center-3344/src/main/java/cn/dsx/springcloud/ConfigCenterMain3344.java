package cn.dsx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * curl -X POST "http://localhost:3344/actuator/bus-refresh"
 * curl -X POST "http://localhost:3344/actuator/bus-refresh"
 * curl -X POST "http://localhost:3344/actuator/bus-refresh"
 * @Classname: ConfigCenterMain3344
 * @Author: Dsx
 * @Date: 2020/04/14/9:04
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
