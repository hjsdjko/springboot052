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

import com.entity.ShengchanjijianEntity;
import com.entity.view.ShengchanjijianView;

import com.service.ShengchanjijianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 生产计件
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
@RestController
@RequestMapping("/shengchanjijian")
public class ShengchanjijianController {
    @Autowired
    private ShengchanjijianService shengchanjijianService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShengchanjijianEntity shengchanjijian,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shengchanshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shengchanshijianend,
		HttpServletRequest request){
        EntityWrapper<ShengchanjijianEntity> ew = new EntityWrapper<ShengchanjijianEntity>();
                if(shengchanshijianstart!=null) ew.ge("shengchanshijian", shengchanshijianstart);
                if(shengchanshijianend!=null) ew.le("shengchanshijian", shengchanshijianend);

		PageUtils page = shengchanjijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shengchanjijian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShengchanjijianEntity shengchanjijian, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shengchanshijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date shengchanshijianend,
		HttpServletRequest request){
        EntityWrapper<ShengchanjijianEntity> ew = new EntityWrapper<ShengchanjijianEntity>();
                if(shengchanshijianstart!=null) ew.ge("shengchanshijian", shengchanshijianstart);
                if(shengchanshijianend!=null) ew.le("shengchanshijian", shengchanshijianend);

		PageUtils page = shengchanjijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shengchanjijian), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShengchanjijianEntity shengchanjijian){
       	EntityWrapper<ShengchanjijianEntity> ew = new EntityWrapper<ShengchanjijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shengchanjijian, "shengchanjijian")); 
        return R.ok().put("data", shengchanjijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShengchanjijianEntity shengchanjijian){
        EntityWrapper< ShengchanjijianEntity> ew = new EntityWrapper< ShengchanjijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shengchanjijian, "shengchanjijian")); 
		ShengchanjijianView shengchanjijianView =  shengchanjijianService.selectView(ew);
		return R.ok("查询生产计件成功").put("data", shengchanjijianView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShengchanjijianEntity shengchanjijian = shengchanjijianService.selectById(id);
        return R.ok().put("data", shengchanjijian);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShengchanjijianEntity shengchanjijian = shengchanjijianService.selectById(id);
        return R.ok().put("data", shengchanjijian);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShengchanjijianEntity shengchanjijian, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shengchanjijian);
        shengchanjijianService.insert(shengchanjijian);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShengchanjijianEntity shengchanjijian, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shengchanjijian);
        shengchanjijianService.insert(shengchanjijian);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShengchanjijianEntity shengchanjijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shengchanjijian);
        shengchanjijianService.updateById(shengchanjijian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shengchanjijianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
