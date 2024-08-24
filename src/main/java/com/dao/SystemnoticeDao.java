package com.dao;

import com.entity.SystemnoticeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SystemnoticeVO;
import com.entity.view.SystemnoticeView;


/**
 * 系统公告
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public interface SystemnoticeDao extends BaseMapper<SystemnoticeEntity> {
	
	List<SystemnoticeVO> selectListVO(@Param("ew") Wrapper<SystemnoticeEntity> wrapper);
	
	SystemnoticeVO selectVO(@Param("ew") Wrapper<SystemnoticeEntity> wrapper);
	
	List<SystemnoticeView> selectListView(@Param("ew") Wrapper<SystemnoticeEntity> wrapper);

	List<SystemnoticeView> selectListView(Pagination page,@Param("ew") Wrapper<SystemnoticeEntity> wrapper);

	
	SystemnoticeView selectView(@Param("ew") Wrapper<SystemnoticeEntity> wrapper);
	

}
