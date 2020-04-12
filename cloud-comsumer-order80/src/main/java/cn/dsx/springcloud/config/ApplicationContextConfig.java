package cn.dsx.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname: ApplicationContextConfig
 * @Author: Dsx
 * @Date: 2020/04/12/10:27
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
