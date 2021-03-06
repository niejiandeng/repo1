package cn.dsx.springcloud.service;

import cn.dsx.springcloud.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 客户端配置
 * fallback指定 服务降级方法
 * 这里处理有一个好处 对每一个方法都针对性的做一个 服务降级  达到解耦的目的
 * @Classname: PaymentHystrixService
 * @Author: Dsx
 * @Date: 2020/04/13/10:30
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT" ,fallback = PaymentFallbackService.class)
public interface PaymentHystrixService{
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
