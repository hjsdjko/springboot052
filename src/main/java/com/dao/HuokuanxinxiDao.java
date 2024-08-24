package com.dao;

import com.entity.HuokuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuokuanxinxiVO;
import com.entity.view.HuokuanxinxiView;


/**
 * 货款信息
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public interface HuokuanxinxiDao extends BaseMapper<HuokuanxinxiEntity> {
	
	List<HuokuanxinxiVO> selectListVO(@Param("ew") Wrapper<HuokuanxinxiEntity> wrapper);
	
	HuokuanxinxiVO selectVO(@Param("ew") Wrapper<HuokuanxinxiEntity> wrapper);
	
	List<HuokuanxinxiView> selectListView(@Param("ew") Wrapper<HuokuanxinxiEntity> wrapper);

	List<HuokuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuokuanxinxiEntity> wrapper);

	
	HuokuanxinxiView selectView(@Param("ew") Wrapper<HuokuanxinxiEntity> wrapper);
	

}
