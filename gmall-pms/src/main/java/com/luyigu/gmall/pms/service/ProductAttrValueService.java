package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.ProductAttrValue;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu属性值
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface ProductAttrValueService extends IService<ProductAttrValue> {

    PageVo queryPage(QueryCondition params);
}

