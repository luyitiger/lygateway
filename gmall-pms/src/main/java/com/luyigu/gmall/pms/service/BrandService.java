package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.Brand;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 品牌
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

