package com.luyigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.wms.entity.FeightTemplate;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 运费模板
 *
 * @author jiangli
 * @since  2020-06-14 16:39:48
 */
public interface FeightTemplateService extends IService<FeightTemplate> {

    PageVo queryPage(QueryCondition params);
}

