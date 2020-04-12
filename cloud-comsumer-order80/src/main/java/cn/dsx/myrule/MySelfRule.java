package cn.dsx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname: MySelfRule
 * @Author: Dsx
 * @Date: 2020/04/12/21:30
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule rule(){
        return new RandomRule();// 定义为随机
    }

}
