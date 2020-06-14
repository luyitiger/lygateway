package com.luyigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.wms.entity.WareInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 仓库信息
 *
 * @author jiangli
 * @since  2020-06-14 16:39:48
 */
public interface WareInfoService extends IService<WareInfo> {

    PageVo queryPage(QueryCondition params);
}

