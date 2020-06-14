package com.luyigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luyigu.gmall.ums.entity.MemberLoginLog;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员登录记录
 *
 * @author jiangli
 * @since  2020-06-14 16:27:23
 */
public interface MemberLoginLogService extends IService<MemberLoginLog> {

    PageVo queryPage(QueryCondition params);
}

