package com.luyigu.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.sms.dao.SmsSeckillSkuNoticeDao;
import com.luyigu.gmall.sms.entity.SmsSeckillSkuNotice;
import com.luyigu.gmall.sms.service.SmsSeckillSkuNoticeService;

@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl extends ServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNotice> implements SmsSeckillSkuNoticeService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SmsSeckillSkuNotice> page = this.page(
                new Query<SmsSeckillSkuNotice>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}