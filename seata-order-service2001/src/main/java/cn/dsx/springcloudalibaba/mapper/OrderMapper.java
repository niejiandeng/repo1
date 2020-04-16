package cn.dsx.springcloudalibaba.mapper;

import cn.dsx.springcloudalibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @Classname: OrderMapper
 * @Author: Dsx
 * @Date: 2020/04/16/14:07
 */
@Mapper
public interface OrderMapper {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从0改为1
    void update(@Param("userId") Long userId,
                @Param("status") Integer status);
}
