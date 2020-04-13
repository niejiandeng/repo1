package cn.dsx.springcloud.service.impl;

import cn.dsx.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Classname: PaymentFallbackService
 * @Author: Dsx
 * @Date: 2020/04/13/10:29
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
