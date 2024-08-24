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


import com.dao.GongzizhanghaoDao;
import com.entity.GongzizhanghaoEntity;
import com.service.GongzizhanghaoService;
import com.entity.vo.GongzizhanghaoVO;
import com.entity.view.GongzizhanghaoView;

@Service("gongzizhanghaoService")
public class GongzizhanghaoServiceImpl extends ServiceImpl<GongzizhanghaoDao, GongzizhanghaoEntity> implements GongzizhanghaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzizhanghaoEntity> page = this.selectPage(
                new Query<GongzizhanghaoEntity>(params).getPage(),
                new EntityWrapper<GongzizhanghaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzizhanghaoEntity> wrapper) {
		  Page<GongzizhanghaoView> page =new Query<GongzizhanghaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GongzizhanghaoVO> selectListVO(Wrapper<GongzizhanghaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzizhanghaoVO selectVO(Wrapper<GongzizhanghaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzizhanghaoView> selectListView(Wrapper<GongzizhanghaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzizhanghaoView selectView(Wrapper<GongzizhanghaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
