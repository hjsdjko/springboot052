package com.dao;

import com.entity.GongzizhanghaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzizhanghaoVO;
import com.entity.view.GongzizhanghaoView;


/**
 * 工资账号
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public interface GongzizhanghaoDao extends BaseMapper<GongzizhanghaoEntity> {
	
	List<GongzizhanghaoVO> selectListVO(@Param("ew") Wrapper<GongzizhanghaoEntity> wrapper);
	
	GongzizhanghaoVO selectVO(@Param("ew") Wrapper<GongzizhanghaoEntity> wrapper);
	
	List<GongzizhanghaoView> selectListView(@Param("ew") Wrapper<GongzizhanghaoEntity> wrapper);

	List<GongzizhanghaoView> selectListView(Pagination page,@Param("ew") Wrapper<GongzizhanghaoEntity> wrapper);

	
	GongzizhanghaoView selectView(@Param("ew") Wrapper<GongzizhanghaoEntity> wrapper);
	

}
