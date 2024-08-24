package com.dao;

import com.entity.ChanpinchukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinchukuVO;
import com.entity.view.ChanpinchukuView;


/**
 * 产品出库
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public interface ChanpinchukuDao extends BaseMapper<ChanpinchukuEntity> {
	
	List<ChanpinchukuVO> selectListVO(@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);
	
	ChanpinchukuVO selectVO(@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);
	
	List<ChanpinchukuView> selectListView(@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);

	List<ChanpinchukuView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);

	
	ChanpinchukuView selectView(@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);



}
