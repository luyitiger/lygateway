package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.SpuImages;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu图片
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageVo queryPage(QueryCondition params);
}

