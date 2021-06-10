package com.xiaoneng.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoneng.common.utils.PageUtils;
import com.xiaoneng.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:14:37
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

