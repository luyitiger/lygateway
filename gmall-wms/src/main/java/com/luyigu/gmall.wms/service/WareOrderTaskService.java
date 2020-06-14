package com.luyigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.wms.entity.WareOrderTask;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 库存工作单
 *
 * @author jiangli
 * @since  2020-06-14 16:39:48
 */
public interface WareOrderTaskService extends IService<WareOrderTask> {

    PageVo queryPage(QueryCondition params);
}

