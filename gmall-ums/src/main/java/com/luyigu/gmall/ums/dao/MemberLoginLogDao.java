package com.luyigu.gmall.ums.dao;

import com.luyigu.gmall.ums.entity.MemberLoginLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * @author jiangli
 * @since  2020-06-14 16:27:23
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLog> {
	
}
