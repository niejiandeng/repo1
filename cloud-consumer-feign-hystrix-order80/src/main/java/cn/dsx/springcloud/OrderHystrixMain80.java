package cn.dsx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务降级是为了在服务繁忙或者报错的时候 给用户一个友好的提示
 * 服务熔断 是达到最大访问量之后 直接拒绝访问    服务熔断会导致服务降级  当访问量降低之后 继续接收访问请求
 * 服务限流  限制规定时间内 只能有多少个用户访问该服务
 * @Classname: OrderHystrixMain80
 * @Author: Dsx
 * @Date: 2020/04/13/10:28
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80{
    public static void main(String[] args)    {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}

