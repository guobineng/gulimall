package com.xiaoneng.gulimall.coupon.dao;

import com.xiaoneng.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:00:14
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
