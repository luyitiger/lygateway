package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsSeckillSessionDao;
import com.luyigu.gmall.sms.entity.SmsSeckillSession;
import com.luyigu.gmall.sms.service.SmsSeckillSessionService;

@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl extends ServiceImpl<SmsSeckillSessionDao, SmsSeckillSession> implements SmsSeckillSessionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsSeckillSession> page = this.page(
                new Query<SmsSeckillSession>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}