package cn.dsx.springcloud.service;

import cn.dsx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname: PaymentService
 * @Author: Dsx
 * @Date: 2020/04/12/9:47
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
