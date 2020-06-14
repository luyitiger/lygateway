package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsSpuLadder;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品阶梯价格
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsSpuLadderService extends IService<SmsSpuLadder> {

    PageVo queryPage(QueryCondition params);
}

