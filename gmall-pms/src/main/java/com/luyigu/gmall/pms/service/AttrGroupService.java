package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.AttrGroup;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 属性分组
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface AttrGroupService extends IService<AttrGroup> {

    PageVo queryPage(QueryCondition params);
}

