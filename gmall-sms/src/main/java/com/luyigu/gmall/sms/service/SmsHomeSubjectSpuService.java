package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsHomeSubjectSpu;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 专题商品
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsHomeSubjectSpuService extends IService<SmsHomeSubjectSpu> {

    PageVo queryPage(QueryCondition params);
}

