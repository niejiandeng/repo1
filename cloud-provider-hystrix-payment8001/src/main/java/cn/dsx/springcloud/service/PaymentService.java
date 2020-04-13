package cn.dsx.springcloud.service;

/**
 * @Classname: PaymentService
 * @Author: Dsx
 * @Date: 2020/04/13/10:07
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);
}
