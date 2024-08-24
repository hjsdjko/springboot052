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


import com.dao.JijiangongziDao;
import com.entity.JijiangongziEntity;
import com.service.JijiangongziService;
import com.entity.vo.JijiangongziVO;
import com.entity.view.JijiangongziView;

@Service("jijiangongziService")
public class JijiangongziServiceImpl extends ServiceImpl<JijiangongziDao, JijiangongziEntity> implements JijiangongziService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JijiangongziEntity> page = this.selectPage(
                new Query<JijiangongziEntity>(params).getPage(),
                new EntityWrapper<JijiangongziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JijiangongziEntity> wrapper) {
		  Page<JijiangongziView> page =new Query<JijiangongziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JijiangongziVO> selectListVO(Wrapper<JijiangongziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JijiangongziVO selectVO(Wrapper<JijiangongziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JijiangongziView> selectListView(Wrapper<JijiangongziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JijiangongziView selectView(Wrapper<JijiangongziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
