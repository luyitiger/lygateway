package com.luyigu.gmall.sms.dao;

import com.luyigu.gmall.sms.entity.SmsCouponSpuRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Mapper
public interface SmsCouponSpuRelationDao extends BaseMapper<SmsCouponSpuRelation> {
	
}
