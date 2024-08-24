package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JijianchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JijianchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JijianchanpinView;


/**
 * 计件产品
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
public interface JijianchanpinService extends IService<JijianchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JijianchanpinVO> selectListVO(Wrapper<JijianchanpinEntity> wrapper);
   	
   	JijianchanpinVO selectVO(@Param("ew") Wrapper<JijianchanpinEntity> wrapper);
   	
   	List<JijianchanpinView> selectListView(Wrapper<JijianchanpinEntity> wrapper);
   	
   	JijianchanpinView selectView(@Param("ew") Wrapper<JijianchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JijianchanpinEntity> wrapper);

   	

}

