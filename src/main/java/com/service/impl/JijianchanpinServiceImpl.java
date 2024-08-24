package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JijianchanpinDao;
import com.entity.JijianchanpinEntity;
import com.service.JijianchanpinService;
import com.entity.vo.JijianchanpinVO;
import com.entity.view.JijianchanpinView;

@Service("jijianchanpinService")
public class JijianchanpinServiceImpl extends ServiceImpl<JijianchanpinDao, JijianchanpinEntity> implements JijianchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JijianchanpinEntity> page = this.selectPage(
                new Query<JijianchanpinEntity>(params).getPage(),
                new EntityWrapper<JijianchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JijianchanpinEntity> wrapper) {
		  Page<JijianchanpinView> page =new Query<JijianchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JijianchanpinVO> selectListVO(Wrapper<JijianchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JijianchanpinVO selectVO(Wrapper<JijianchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JijianchanpinView> selectListView(Wrapper<JijianchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JijianchanpinView selectView(Wrapper<JijianchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
