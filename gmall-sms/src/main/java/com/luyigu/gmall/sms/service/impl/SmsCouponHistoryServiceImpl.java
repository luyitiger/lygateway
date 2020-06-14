package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsCouponHistoryDao;
import com.luyigu.gmall.sms.entity.SmsCouponHistory;
import com.luyigu.gmall.sms.service.SmsCouponHistoryService;

@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryDao, SmsCouponHistory> implements SmsCouponHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsCouponHistory> page = this.page(
                new Query<SmsCouponHistory>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}