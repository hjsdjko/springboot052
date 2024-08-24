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

import com.entity.GongzizhanghaoEntity;
import com.entity.view.GongzizhanghaoView;

import com.service.GongzizhanghaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 工资账号
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
@RestController
@RequestMapping("/gongzizhanghao")
public class GongzizhanghaoController {
    @Autowired
    private GongzizhanghaoService gongzizhanghaoService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongzizhanghaoEntity gongzizhanghao,
		HttpServletRequest request){
        EntityWrapper<GongzizhanghaoEntity> ew = new EntityWrapper<GongzizhanghaoEntity>();

		PageUtils page = gongzizhanghaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzizhanghao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongzizhanghaoEntity gongzizhanghao, 
		HttpServletRequest request){
        EntityWrapper<GongzizhanghaoEntity> ew = new EntityWrapper<GongzizhanghaoEntity>();

		PageUtils page = gongzizhanghaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzizhanghao), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongzizhanghaoEntity gongzizhanghao){
       	EntityWrapper<GongzizhanghaoEntity> ew = new EntityWrapper<GongzizhanghaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongzizhanghao, "gongzizhanghao")); 
        return R.ok().put("data", gongzizhanghaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongzizhanghaoEntity gongzizhanghao){
        EntityWrapper< GongzizhanghaoEntity> ew = new EntityWrapper< GongzizhanghaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongzizhanghao, "gongzizhanghao")); 
		GongzizhanghaoView gongzizhanghaoView =  gongzizhanghaoService.selectView(ew);
		return R.ok("查询工资账号成功").put("data", gongzizhanghaoView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongzizhanghaoEntity gongzizhanghao = gongzizhanghaoService.selectById(id);
        return R.ok().put("data", gongzizhanghao);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongzizhanghaoEntity gongzizhanghao = gongzizhanghaoService.selectById(id);
        return R.ok().put("data", gongzizhanghao);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongzizhanghaoEntity gongzizhanghao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gongzizhanghao);
        gongzizhanghaoService.insert(gongzizhanghao);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongzizhanghaoEntity gongzizhanghao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gongzizhanghao);
        gongzizhanghaoService.insert(gongzizhanghao);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GongzizhanghaoEntity gongzizhanghao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongzizhanghao);
        gongzizhanghaoService.updateById(gongzizhanghao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongzizhanghaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
