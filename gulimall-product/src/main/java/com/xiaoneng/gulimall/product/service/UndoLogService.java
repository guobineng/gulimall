package com.xiaoneng.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoneng.common.utils.PageUtils;
import com.xiaoneng.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 10:58:18
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

