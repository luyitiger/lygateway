package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.SpuInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu信息
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface SpuInfoService extends IService<SpuInfo> {

    PageVo queryPage(QueryCondition params);
}

