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


import com.dao.ChanpinchukuDao;
import com.entity.ChanpinchukuEntity;
import com.service.ChanpinchukuService;
import com.entity.vo.ChanpinchukuVO;
import com.entity.view.ChanpinchukuView;

@Service("chanpinchukuService")
public class ChanpinchukuServiceImpl extends ServiceImpl<ChanpinchukuDao, ChanpinchukuEntity> implements ChanpinchukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinchukuEntity> page = this.selectPage(
                new Query<ChanpinchukuEntity>(params).getPage(),
                new EntityWrapper<ChanpinchukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinchukuEntity> wrapper) {
		  Page<ChanpinchukuView> page =new Query<ChanpinchukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChanpinchukuVO> selectListVO(Wrapper<ChanpinchukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinchukuVO selectVO(Wrapper<ChanpinchukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinchukuView> selectListView(Wrapper<ChanpinchukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinchukuView selectView(Wrapper<ChanpinchukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ChanpinchukuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ChanpinchukuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ChanpinchukuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
