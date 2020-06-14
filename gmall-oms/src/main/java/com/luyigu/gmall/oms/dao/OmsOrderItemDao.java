package com.luyigu.gmall.oms.dao;

import com.luyigu.gmall.oms.entity.OmsOrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
@Mapper
public interface OmsOrderItemDao extends BaseMapper<OmsOrderItem> {
	
}
