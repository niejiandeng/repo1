package cn.dsx.springcloudalibaba.controller;

import cn.dsx.springcloud.entities.CommonResult;
import cn.dsx.springcloudalibaba.domain.Order;
import cn.dsx.springcloudalibaba.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname: OrderController
 * @Author: Dsx
 * @Date: 2020/04/16/14:12
 */
@RestController
public class OrderController{
    @Resource
    private OrderService orderService;

    @PostMapping("/order/create")
    public CommonResult create(@RequestBody Order order)    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}