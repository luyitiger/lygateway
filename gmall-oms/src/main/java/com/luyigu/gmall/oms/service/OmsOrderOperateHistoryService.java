package com.luyigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.oms.entity.OmsOrderOperateHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单操作历史记录
 *
 * @author luyi
 * @since  2020-06-14 15:48:06
 */
public interface OmsOrderOperateHistoryService extends IService<OmsOrderOperateHistory> {

    PageVo queryPage(QueryCondition params);
}

