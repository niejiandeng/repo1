package cn.dsx.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: FlowLimitController
 * @Author: Dsx
 * @Date: 2020/04/15/20:32
 */
@RestController
public class FlowLimitController {


    @GetMapping("a")
    public String returnA() {
        return "a";
    }

    @GetMapping("b")
    public String returnB() {
        return "b";
    }
}
