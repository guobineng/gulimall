package com.xiaoneng.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoneng.common.utils.PageUtils;
import com.xiaoneng.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:26:13
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

