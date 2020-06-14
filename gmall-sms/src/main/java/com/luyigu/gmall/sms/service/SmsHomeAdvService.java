package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsHomeAdv;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 首页轮播广告
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsHomeAdvService extends IService<SmsHomeAdv> {

    PageVo queryPage(QueryCondition params);
}

