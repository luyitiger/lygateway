package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsHomeSubjectSpuDao;
import com.luyigu.gmall.sms.entity.SmsHomeSubjectSpu;
import com.luyigu.gmall.sms.service.SmsHomeSubjectSpuService;

@Service("smsHomeSubjectSpuService")
public class SmsHomeSubjectSpuServiceImpl extends ServiceImpl<SmsHomeSubjectSpuDao, SmsHomeSubjectSpu> implements SmsHomeSubjectSpuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsHomeSubjectSpu> page = this.page(
                new Query<SmsHomeSubjectSpu>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}