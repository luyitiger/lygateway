package com.luyigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.oms.entity.OmsRefundInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 退款信息
 *
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
public interface OmsRefundInfoService extends IService<OmsRefundInfo> {

    PageVo queryPage(QueryCondition params);
}

