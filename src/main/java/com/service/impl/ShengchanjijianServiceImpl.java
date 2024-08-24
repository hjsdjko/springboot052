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


import com.dao.ShengchanjijianDao;
import com.entity.ShengchanjijianEntity;
import com.service.ShengchanjijianService;
import com.entity.vo.ShengchanjijianVO;
import com.entity.view.ShengchanjijianView;

@Service("shengchanjijianService")
public class ShengchanjijianServiceImpl extends ServiceImpl<ShengchanjijianDao, ShengchanjijianEntity> implements ShengchanjijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengchanjijianEntity> page = this.selectPage(
                new Query<ShengchanjijianEntity>(params).getPage(),
                new EntityWrapper<ShengchanjijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengchanjijianEntity> wrapper) {
		  Page<ShengchanjijianView> page =new Query<ShengchanjijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShengchanjijianVO> selectListVO(Wrapper<ShengchanjijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengchanjijianVO selectVO(Wrapper<ShengchanjijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengchanjijianView> selectListView(Wrapper<ShengchanjijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengchanjijianView selectView(Wrapper<ShengchanjijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
