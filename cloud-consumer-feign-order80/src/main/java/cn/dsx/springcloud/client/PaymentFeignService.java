package cn.dsx.springcloud.client;

import cn.dsx.springcloud.entities.CommonResult;
import cn.dsx.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * feign调用
 * @Classname: PaymentFeignService
 * @Author: Dsx
 * @Date: 2020/04/13/9:22
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") //指定微服务名称
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}") //地址
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id); //参数以及返回值要一致

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeOut();

}
