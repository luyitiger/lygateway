package com.luyigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.oms.entity.OmsPaymentInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 支付信息表
 *
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfo> {

    PageVo queryPage(QueryCondition params);
}

