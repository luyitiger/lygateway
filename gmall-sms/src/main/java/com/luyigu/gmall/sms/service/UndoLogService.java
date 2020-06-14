package com.luyigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.sms.entity.UndoLog;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 
 *
 * @author luyi
 * @since  2020-06-14 14:12:41
 */
public interface UndoLogService extends IService<UndoLog> {

    PageVo queryPage(QueryCondition params);
}

