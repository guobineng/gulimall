package com.xiaoneng.gulimall.order.dao;

import com.xiaoneng.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:26:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
