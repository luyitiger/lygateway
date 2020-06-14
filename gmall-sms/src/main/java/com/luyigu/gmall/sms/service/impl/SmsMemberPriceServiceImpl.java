package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsMemberPriceDao;
import com.luyigu.gmall.sms.entity.SmsMemberPrice;
import com.luyigu.gmall.sms.service.SmsMemberPriceService;

@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl extends ServiceImpl<SmsMemberPriceDao, SmsMemberPrice> implements SmsMemberPriceService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsMemberPrice> page = this.page(
                new Query<SmsMemberPrice>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}