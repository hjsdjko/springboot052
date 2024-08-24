package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuokuanxinxiEntity;
import com.entity.view.HuokuanxinxiView;

import com.service.HuokuanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 货款信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
@RestController
@RequestMapping("/huokuanxinxi")
public class HuokuanxinxiController {
    @Autowired
    private HuokuanxinxiService huokuanxinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuokuanxinxiEntity huokuanxinxi,
		HttpServletRequest request){
        EntityWrapper<HuokuanxinxiEntity> ew = new EntityWrapper<HuokuanxinxiEntity>();

		PageUtils page = huokuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huokuanxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuokuanxinxiEntity huokuanxinxi, 
		HttpServletRequest request){
        EntityWrapper<HuokuanxinxiEntity> ew = new EntityWrapper<HuokuanxinxiEntity>();

		PageUtils page = huokuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huokuanxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuokuanxinxiEntity huokuanxinxi){
       	EntityWrapper<HuokuanxinxiEntity> ew = new EntityWrapper<HuokuanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huokuanxinxi, "huokuanxinxi")); 
        return R.ok().put("data", huokuanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuokuanxinxiEntity huokuanxinxi){
        EntityWrapper< HuokuanxinxiEntity> ew = new EntityWrapper< HuokuanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huokuanxinxi, "huokuanxinxi")); 
		HuokuanxinxiView huokuanxinxiView =  huokuanxinxiService.selectView(ew);
		return R.ok("查询货款信息成功").put("data", huokuanxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuokuanxinxiEntity huokuanxinxi = huokuanxinxiService.selectById(id);
        return R.ok().put("data", huokuanxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuokuanxinxiEntity huokuanxinxi = huokuanxinxiService.selectById(id);
        return R.ok().put("data", huokuanxinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuokuanxinxiEntity huokuanxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huokuanxinxi);
        huokuanxinxiService.insert(huokuanxinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuokuanxinxiEntity huokuanxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huokuanxinxi);
        huokuanxinxiService.insert(huokuanxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuokuanxinxiEntity huokuanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huokuanxinxi);
        huokuanxinxiService.updateById(huokuanxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huokuanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
