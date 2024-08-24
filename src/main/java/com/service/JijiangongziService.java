package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JijiangongziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JijiangongziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JijiangongziView;


/**
 * 计件工资
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
public interface JijiangongziService extends IService<JijiangongziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JijiangongziVO> selectListVO(Wrapper<JijiangongziEntity> wrapper);
   	
   	JijiangongziVO selectVO(@Param("ew") Wrapper<JijiangongziEntity> wrapper);
   	
   	List<JijiangongziView> selectListView(Wrapper<JijiangongziEntity> wrapper);
   	
   	JijiangongziView selectView(@Param("ew") Wrapper<JijiangongziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JijiangongziEntity> wrapper);

   	

}

