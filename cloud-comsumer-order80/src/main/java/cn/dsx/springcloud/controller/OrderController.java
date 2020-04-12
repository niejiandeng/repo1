package cn.dsx.springcloud.controller;

import cn.dsx.springcloud.entities.CommonResult;
import cn.dsx.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname: OrderController
 * @Author: Dsx
 * @Date: 2020/04/12/10:18
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://127.0.0.1:8001";

    /**
     * 远程调用payment 插入
     * @param payment
     * @return
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        String url = PAYMENT_URL + "/payment/create";
        return restTemplate.postForObject(url, payment, CommonResult.class);
    }

    /**
     * 远程调用payment 查询
     * @param id
     * @return
     */
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        String url = PAYMENT_URL + "/payment/get/";
        return restTemplate.getForObject(url + id, CommonResult.class);
    }

}
