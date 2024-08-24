package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinchukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinchukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinchukuView;


/**
 * 产品出库
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public interface ChanpinchukuService extends IService<ChanpinchukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinchukuVO> selectListVO(Wrapper<ChanpinchukuEntity> wrapper);
   	
   	ChanpinchukuVO selectVO(@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);
   	
   	List<ChanpinchukuView> selectListView(Wrapper<ChanpinchukuEntity> wrapper);
   	
   	ChanpinchukuView selectView(@Param("ew") Wrapper<ChanpinchukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinchukuEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChanpinchukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChanpinchukuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChanpinchukuEntity> wrapper);



}

