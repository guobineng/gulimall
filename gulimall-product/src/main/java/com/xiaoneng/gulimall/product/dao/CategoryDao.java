package com.xiaoneng.gulimall.product.dao;

import com.xiaoneng.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 10:58:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
