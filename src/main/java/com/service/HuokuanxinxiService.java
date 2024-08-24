package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuokuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuokuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuokuanxinxiView;


/**
 * 货款信息
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public interface HuokuanxinxiService extends IService<HuokuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuokuanxinxiVO> selectListVO(Wrapper<HuokuanxinxiEntity> wrapper);
   	
   	HuokuanxinxiVO selectVO(@Param("ew") Wrapper<HuokuanxinxiEntity> wrapper);
   	
   	List<HuokuanxinxiView> selectListView(Wrapper<HuokuanxinxiEntity> wrapper);
   	
   	HuokuanxinxiView selectView(@Param("ew") Wrapper<HuokuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuokuanxinxiEntity> wrapper);

   	

}

