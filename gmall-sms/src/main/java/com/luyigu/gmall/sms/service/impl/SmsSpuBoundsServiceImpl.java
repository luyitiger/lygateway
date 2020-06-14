package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsSpuBoundsDao;
import com.luyigu.gmall.sms.entity.SmsSpuBounds;
import com.luyigu.gmall.sms.service.SmsSpuBoundsService;

@Service("smsSpuBoundsService")
public class SmsSpuBoundsServiceImpl extends ServiceImpl<SmsSpuBoundsDao, SmsSpuBounds> implements SmsSpuBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsSpuBounds> page = this.page(
                new Query<SmsSpuBounds>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}