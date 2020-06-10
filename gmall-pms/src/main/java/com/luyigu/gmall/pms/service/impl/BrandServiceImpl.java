package com.luyigu.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.luyigu.gmall.pms.dao.BrandDao;
import com.luyigu.gmall.pms.entity.Brand;
import com.luyigu.gmall.pms.service.BrandService;

@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, Brand> implements BrandService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<Brand> page = this.page(
                new Query<Brand>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}