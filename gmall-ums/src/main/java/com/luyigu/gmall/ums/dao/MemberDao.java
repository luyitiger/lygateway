package com.luyigu.gmall.ums.dao;

import com.luyigu.gmall.ums.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * @author jiangli
 * @since  2020-06-14 16:27:23
 */
@Mapper
public interface MemberDao extends BaseMapper<Member> {
	
}
