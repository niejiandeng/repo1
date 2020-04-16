package cn.dsx.springcloudalibaba.service.fallback;

import cn.dsx.springcloud.entities.CommonResult;
import cn.dsx.springcloud.entities.Payment;
import cn.dsx.springcloudalibaba.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @Classname: PaymentFallbackService
 * @Author: Dsx
 * @Date: 2020/04/16/10:32
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
