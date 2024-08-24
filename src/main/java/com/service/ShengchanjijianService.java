package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengchanjijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengchanjijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengchanjijianView;


/**
 * 生产计件
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
public interface ShengchanjijianService extends IService<ShengchanjijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengchanjijianVO> selectListVO(Wrapper<ShengchanjijianEntity> wrapper);
   	
   	ShengchanjijianVO selectVO(@Param("ew") Wrapper<ShengchanjijianEntity> wrapper);
   	
   	List<ShengchanjijianView> selectListView(Wrapper<ShengchanjijianEntity> wrapper);
   	
   	ShengchanjijianView selectView(@Param("ew") Wrapper<ShengchanjijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengchanjijianEntity> wrapper);

   	

}

