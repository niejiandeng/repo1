package cn.dsx.springcloudalibaba.controller;

import cn.dsx.springcloudalibaba.domain.CommonResult;
import cn.dsx.springcloudalibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: StorageController
 * @Author: Dsx
 * @Date: 2020/04/16/14:39
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;
    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}
