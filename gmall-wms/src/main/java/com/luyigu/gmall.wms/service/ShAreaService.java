package com.luyigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.wms.entity.ShArea;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 全国省市区信息
 *
 * @author jiangli
 * @since  2020-06-14 16:39:48
 */
public interface ShAreaService extends IService<ShArea> {

    PageVo queryPage(QueryCondition params);
}

