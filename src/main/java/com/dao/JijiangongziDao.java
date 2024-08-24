package com.dao;

import com.entity.JijiangongziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JijiangongziVO;
import com.entity.view.JijiangongziView;


/**
 * 计件工资
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
public interface JijiangongziDao extends BaseMapper<JijiangongziEntity> {
	
	List<JijiangongziVO> selectListVO(@Param("ew") Wrapper<JijiangongziEntity> wrapper);
	
	JijiangongziVO selectVO(@Param("ew") Wrapper<JijiangongziEntity> wrapper);
	
	List<JijiangongziView> selectListView(@Param("ew") Wrapper<JijiangongziEntity> wrapper);

	List<JijiangongziView> selectListView(Pagination page,@Param("ew") Wrapper<JijiangongziEntity> wrapper);

	
	JijiangongziView selectView(@Param("ew") Wrapper<JijiangongziEntity> wrapper);
	

}
