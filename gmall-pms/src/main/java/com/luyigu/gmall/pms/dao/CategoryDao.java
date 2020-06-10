package com.luyigu.gmall.pms.dao;

import com.luyigu.gmall.pms.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * @author luyi
 * @since  2020-06-11 01:48:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
	
}
