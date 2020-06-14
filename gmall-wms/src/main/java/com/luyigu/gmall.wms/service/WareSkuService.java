package com.luyigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.wms.entity.WareSku;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品库存
 *
 * @author jiangli
 * @since  2020-06-14 16:39:48
 */
public interface WareSkuService extends IService<WareSku> {

    PageVo queryPage(QueryCondition params);
}

