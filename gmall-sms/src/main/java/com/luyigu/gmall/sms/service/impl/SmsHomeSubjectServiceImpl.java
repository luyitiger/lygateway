package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsHomeSubjectDao;
import com.luyigu.gmall.sms.entity.SmsHomeSubject;
import com.luyigu.gmall.sms.service.SmsHomeSubjectService;

@Service("smsHomeSubjectService")
public class SmsHomeSubjectServiceImpl extends ServiceImpl<SmsHomeSubjectDao, SmsHomeSubject> implements SmsHomeSubjectService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsHomeSubject> page = this.page(
                new Query<SmsHomeSubject>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}