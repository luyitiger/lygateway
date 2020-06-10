package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.SkuImages;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * sku图片
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface SkuImagesService extends IService<SkuImages> {

    PageVo queryPage(QueryCondition params);
}

