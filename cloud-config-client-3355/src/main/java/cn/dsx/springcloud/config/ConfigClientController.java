package cn.dsx.springcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: ConfigClientController
 * @Author: Dsx
 * @Date: 2020/04/14/9:32
 */
@RestController
@RefreshScope//刷新        curl -X POST "http://localhost:3355/actuator/refresh"
public class ConfigClientController{
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo()    {
        return configInfo;
    }
}
