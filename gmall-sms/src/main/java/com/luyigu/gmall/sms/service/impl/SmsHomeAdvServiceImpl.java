package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsHomeAdvDao;
import com.luyigu.gmall.sms.entity.SmsHomeAdv;
import com.luyigu.gmall.sms.service.SmsHomeAdvService;

@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl extends ServiceImpl<SmsHomeAdvDao, SmsHomeAdv> implements SmsHomeAdvService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsHomeAdv> page = this.page(
                new Query<SmsHomeAdv>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}