package cn.dsx.springcloudalibaba.service;

import cn.dsx.springcloud.entities.CommonResult;
import cn.dsx.springcloud.entities.Payment;
import cn.dsx.springcloudalibaba.service.fallback.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Classname: PaymentService
 * @Author: Dsx
 * @Date: 2020/04/16/10:32
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}

