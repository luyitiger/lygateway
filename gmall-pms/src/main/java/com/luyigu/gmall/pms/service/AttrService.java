package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.Attr;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品属性
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface AttrService extends IService<Attr> {

    PageVo queryPage(QueryCondition params);
}

