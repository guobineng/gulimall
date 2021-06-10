package com.xiaoneng.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoneng.common.utils.PageUtils;
import com.xiaoneng.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:14:37
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

