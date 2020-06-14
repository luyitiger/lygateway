package com.luyigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.oms.entity.OmsOrderItem;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单项信息
 *
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
public interface OmsOrderItemService extends IService<OmsOrderItem> {

    PageVo queryPage(QueryCondition params);
}

