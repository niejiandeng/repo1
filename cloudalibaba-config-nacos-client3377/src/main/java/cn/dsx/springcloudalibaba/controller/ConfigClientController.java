package cn.dsx.springcloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: ConfigClientController
 * @Author: Dsx
 * @Date: 2020/04/15/11:08
 */
@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConfigClientController{
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}

