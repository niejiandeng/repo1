package cn.dsx.springcloudalibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname: MyBatisConfig
 * @Author: Dsx
 * @Date: 2020/04/16/14:05
 */
@Configuration
@MapperScan({"cn.dsx.springcloudalibaba.mapper"})//MapperScan中不能有任何空格 否则报错 bean找不到
public class MyBatisConfig {
}


