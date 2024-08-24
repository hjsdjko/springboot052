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


import com.dao.SystemnoticeDao;
import com.entity.SystemnoticeEntity;
import com.service.SystemnoticeService;
import com.entity.vo.SystemnoticeVO;
import com.entity.view.SystemnoticeView;

@Service("systemnoticeService")
public class SystemnoticeServiceImpl extends ServiceImpl<SystemnoticeDao, SystemnoticeEntity> implements SystemnoticeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SystemnoticeEntity> page = this.selectPage(
                new Query<SystemnoticeEntity>(params).getPage(),
                new EntityWrapper<SystemnoticeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SystemnoticeEntity> wrapper) {
		  Page<SystemnoticeView> page =new Query<SystemnoticeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<SystemnoticeVO> selectListVO(Wrapper<SystemnoticeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SystemnoticeVO selectVO(Wrapper<SystemnoticeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SystemnoticeView> selectListView(Wrapper<SystemnoticeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SystemnoticeView selectView(Wrapper<SystemnoticeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
