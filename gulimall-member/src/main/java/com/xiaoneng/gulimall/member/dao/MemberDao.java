package com.xiaoneng.gulimall.member.dao;

import com.xiaoneng.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author guobineng
 * @email 2323498783@qq.com
 * @date 2021-06-06 22:14:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
