package com.luyigu.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.oms.dao.OmsRefundInfoDao;
import com.luyigu.gmall.oms.entity.OmsRefundInfo;
import com.luyigu.gmall.oms.service.OmsRefundInfoService;

@Service("omsRefundInfoService")
public class OmsRefundInfoServiceImpl extends ServiceImpl<OmsRefundInfoDao, OmsRefundInfo> implements OmsRefundInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsRefundInfo> page = this.page(
                new Query<OmsRefundInfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}