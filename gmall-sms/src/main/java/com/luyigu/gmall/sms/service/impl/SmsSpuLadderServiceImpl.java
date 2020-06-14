package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsSpuLadderDao;
import com.luyigu.gmall.sms.entity.SmsSpuLadder;
import com.luyigu.gmall.sms.service.SmsSpuLadderService;

@Service("smsSpuLadderService")
public class SmsSpuLadderServiceImpl extends ServiceImpl<SmsSpuLadderDao, SmsSpuLadder> implements SmsSpuLadderService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsSpuLadder> page = this.page(
                new Query<SmsSpuLadder>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}