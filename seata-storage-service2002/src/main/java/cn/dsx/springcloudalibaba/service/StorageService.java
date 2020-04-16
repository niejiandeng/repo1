package cn.dsx.springcloudalibaba.service;

/**
 * @Classname: StorageService
 * @Author: Dsx
 * @Date: 2020/04/16/14:37
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
