package com.luyigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.oms.dao.OmsOrderSettingDao;
import com.luyigu.gmall.oms.entity.OmsOrderSetting;
import com.luyigu.gmall.oms.service.OmsOrderSettingService;

@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingDao, OmsOrderSetting> implements OmsOrderSettingService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsOrderSetting> page = this.page(
                new Query<OmsOrderSetting>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}