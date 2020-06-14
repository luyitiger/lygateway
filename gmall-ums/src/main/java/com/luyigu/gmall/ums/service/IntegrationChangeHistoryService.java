package com.luyigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.ums.entity.IntegrationChangeHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 积分变化历史记录
 *
 * @author jiangli
 * @since  2020-06-14 16:27:23
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistory> {

    PageVo queryPage(QueryCondition params);
}

