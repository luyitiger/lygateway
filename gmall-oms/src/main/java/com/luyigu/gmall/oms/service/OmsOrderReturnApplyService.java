package com.luyigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.oms.entity.OmsOrderReturnApply;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单退货申请
 *
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApply> {

    PageVo queryPage(QueryCondition params);
}

