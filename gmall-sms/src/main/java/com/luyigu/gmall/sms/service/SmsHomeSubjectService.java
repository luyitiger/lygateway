package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsHomeSubject;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsHomeSubjectService extends IService<SmsHomeSubject> {

    PageVo queryPage(QueryCondition params);
}

