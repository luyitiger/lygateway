package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.Category;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品三级分类
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface CategoryService extends IService<Category> {

    PageVo queryPage(QueryCondition params);
}

