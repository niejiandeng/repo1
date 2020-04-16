package cn.dsx.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname: MyBatisConfig
 * @Author: Dsx
 * @Date: 2020/04/16/14:43
 */
@Configuration
@MapperScan({"cn.dsx.springcloud.mapper"})
public class MyBatisConfig {
}
