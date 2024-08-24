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


import com.dao.HuokuanxinxiDao;
import com.entity.HuokuanxinxiEntity;
import com.service.HuokuanxinxiService;
import com.entity.vo.HuokuanxinxiVO;
import com.entity.view.HuokuanxinxiView;

@Service("huokuanxinxiService")
public class HuokuanxinxiServiceImpl extends ServiceImpl<HuokuanxinxiDao, HuokuanxinxiEntity> implements HuokuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuokuanxinxiEntity> page = this.selectPage(
                new Query<HuokuanxinxiEntity>(params).getPage(),
                new EntityWrapper<HuokuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuokuanxinxiEntity> wrapper) {
		  Page<HuokuanxinxiView> page =new Query<HuokuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<HuokuanxinxiVO> selectListVO(Wrapper<HuokuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuokuanxinxiVO selectVO(Wrapper<HuokuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuokuanxinxiView> selectListView(Wrapper<HuokuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuokuanxinxiView selectView(Wrapper<HuokuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
