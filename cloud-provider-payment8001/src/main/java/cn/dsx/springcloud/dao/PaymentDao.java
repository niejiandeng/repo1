package cn.dsx.springcloud.dao;

import cn.dsx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname: PaymentDao
 * @Author: Dsx
 * @Date: 2020/04/12/9:45
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
