package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.SkuSaleAttrValue;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * sku销售属性&值
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValue> {

    PageVo queryPage(QueryCondition params);
}

