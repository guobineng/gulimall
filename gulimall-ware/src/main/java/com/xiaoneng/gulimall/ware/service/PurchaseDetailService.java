package com.xiaoneng.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoneng.common.utils.PageUtils;
import com.xiaoneng.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:34:37
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

