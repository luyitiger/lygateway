package com.luyigu.gmall.sms.dao;

import com.luyigu.gmall.sms.entity.SmsHomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * @author luyi
 * @since  2020-06-14 14:12:42
 */
@Mapper
public interface SmsHomeSubjectDao extends BaseMapper<SmsHomeSubject> {
	
}
