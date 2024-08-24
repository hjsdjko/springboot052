package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SystemnoticeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SystemnoticeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SystemnoticeView;


/**
 * 系统公告
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public interface SystemnoticeService extends IService<SystemnoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SystemnoticeVO> selectListVO(Wrapper<SystemnoticeEntity> wrapper);
   	
   	SystemnoticeVO selectVO(@Param("ew") Wrapper<SystemnoticeEntity> wrapper);
   	
   	List<SystemnoticeView> selectListView(Wrapper<SystemnoticeEntity> wrapper);
   	
   	SystemnoticeView selectView(@Param("ew") Wrapper<SystemnoticeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SystemnoticeEntity> wrapper);

   	

}

