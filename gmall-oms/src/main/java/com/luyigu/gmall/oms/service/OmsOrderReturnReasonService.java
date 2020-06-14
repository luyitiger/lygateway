package com.luyigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.oms.entity.OmsOrderReturnReason;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 退货原因
 *
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
public interface OmsOrderReturnReasonService extends IService<OmsOrderReturnReason> {

    PageVo queryPage(QueryCondition params);
}

