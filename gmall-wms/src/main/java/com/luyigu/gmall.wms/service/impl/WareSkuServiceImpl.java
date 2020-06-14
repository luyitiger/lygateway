package com.luyigu.gmall.wms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.wms.dao.WareSkuDao;
import com.luyigu.gmall.wms.entity.WareSku;
import com.luyigu.gmall.wms.service.WareSkuService;

@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSku> implements WareSkuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<WareSku> page = this.page(
                new Query<WareSku>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}