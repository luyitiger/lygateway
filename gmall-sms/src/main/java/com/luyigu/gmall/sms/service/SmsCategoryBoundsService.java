package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.SmsCategoryBounds;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品分类积分设置
 *
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
public interface SmsCategoryBoundsService extends IService<SmsCategoryBounds> {

    PageVo queryPage(QueryCondition params);
}

