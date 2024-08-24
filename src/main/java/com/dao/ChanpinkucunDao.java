package com.dao;

import com.entity.ChanpinkucunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinkucunVO;
import com.entity.view.ChanpinkucunView;


/**
 * 产品库存
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public interface ChanpinkucunDao extends BaseMapper<ChanpinkucunEntity> {
	
	List<ChanpinkucunVO> selectListVO(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);
	
	ChanpinkucunVO selectVO(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);
	
	List<ChanpinkucunView> selectListView(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);

	List<ChanpinkucunView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);

	
	ChanpinkucunView selectView(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);
	

}
