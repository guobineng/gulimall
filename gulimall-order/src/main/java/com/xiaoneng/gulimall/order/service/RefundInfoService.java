package com.xiaoneng.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoneng.common.utils.PageUtils;
import com.xiaoneng.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:26:13
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

