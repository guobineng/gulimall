package com.xiaoneng.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoneng.common.utils.PageUtils;
import com.xiaoneng.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:26:13
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

