package com.xiaoneng.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoneng.common.utils.PageUtils;
import com.xiaoneng.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:26:13
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

