package com.luyigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.pms.entity.UndoLog;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 
 *
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
public interface UndoLogService extends IService<UndoLog> {

    PageVo queryPage(QueryCondition params);
}

