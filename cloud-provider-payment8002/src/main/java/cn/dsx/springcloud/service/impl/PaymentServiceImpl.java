package cn.dsx.springcloud.service.impl;

import cn.dsx.springcloud.dao.PaymentDao;
import cn.dsx.springcloud.entities.Payment;
import cn.dsx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname: PaymentServiceImpl
 * @Author: Dsx
 * @Date: 2020/04/12/9:48
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
