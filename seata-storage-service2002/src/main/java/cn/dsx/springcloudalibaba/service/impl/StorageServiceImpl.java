package cn.dsx.springcloudalibaba.service.impl;

import cn.dsx.springcloudalibaba.mapper.StorageMapper;
import cn.dsx.springcloudalibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname: StorageServiceImpl
 * @Author: Dsx
 * @Date: 2020/04/16/14:38
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {


    @Resource
    private StorageMapper storageMapper;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageMapper.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }
}
