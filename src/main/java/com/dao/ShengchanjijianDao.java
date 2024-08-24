package com.dao;

import com.entity.ShengchanjijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengchanjijianVO;
import com.entity.view.ShengchanjijianView;


/**
 * 生产计件
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
public interface ShengchanjijianDao extends BaseMapper<ShengchanjijianEntity> {
	
	List<ShengchanjijianVO> selectListVO(@Param("ew") Wrapper<ShengchanjijianEntity> wrapper);
	
	ShengchanjijianVO selectVO(@Param("ew") Wrapper<ShengchanjijianEntity> wrapper);
	
	List<ShengchanjijianView> selectListView(@Param("ew") Wrapper<ShengchanjijianEntity> wrapper);

	List<ShengchanjijianView> selectListView(Pagination page,@Param("ew") Wrapper<ShengchanjijianEntity> wrapper);

	
	ShengchanjijianView selectView(@Param("ew") Wrapper<ShengchanjijianEntity> wrapper);
	

}
