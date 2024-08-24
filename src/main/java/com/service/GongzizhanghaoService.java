package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzizhanghaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzizhanghaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzizhanghaoView;


/**
 * 工资账号
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public interface GongzizhanghaoService extends IService<GongzizhanghaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzizhanghaoVO> selectListVO(Wrapper<GongzizhanghaoEntity> wrapper);
   	
   	GongzizhanghaoVO selectVO(@Param("ew") Wrapper<GongzizhanghaoEntity> wrapper);
   	
   	List<GongzizhanghaoView> selectListView(Wrapper<GongzizhanghaoEntity> wrapper);
   	
   	GongzizhanghaoView selectView(@Param("ew") Wrapper<GongzizhanghaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzizhanghaoEntity> wrapper);

   	

}

