package com.dao;

import com.entity.JijianchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JijianchanpinVO;
import com.entity.view.JijianchanpinView;


/**
 * 计件产品
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
public interface JijianchanpinDao extends BaseMapper<JijianchanpinEntity> {
	
	List<JijianchanpinVO> selectListVO(@Param("ew") Wrapper<JijianchanpinEntity> wrapper);
	
	JijianchanpinVO selectVO(@Param("ew") Wrapper<JijianchanpinEntity> wrapper);
	
	List<JijianchanpinView> selectListView(@Param("ew") Wrapper<JijianchanpinEntity> wrapper);

	List<JijianchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<JijianchanpinEntity> wrapper);

	
	JijianchanpinView selectView(@Param("ew") Wrapper<JijianchanpinEntity> wrapper);
	

}
