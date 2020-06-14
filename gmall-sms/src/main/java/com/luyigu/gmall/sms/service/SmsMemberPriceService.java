package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsMemberPrice;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品会员价格
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsMemberPriceService extends IService<SmsMemberPrice> {

    PageVo queryPage(QueryCondition params);
}

