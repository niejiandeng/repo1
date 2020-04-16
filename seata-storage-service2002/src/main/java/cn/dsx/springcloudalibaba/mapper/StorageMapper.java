package cn.dsx.springcloudalibaba.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname: StorageMapper
 * @Author: Dsx
 * @Date: 2020/04/16/14:34
 */
@Mapper
public interface StorageMapper {
    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
