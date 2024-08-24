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

import com.entity.JijianchanpinEntity;
import com.entity.view.JijianchanpinView;

import com.service.JijianchanpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 计件产品
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
@RestController
@RequestMapping("/jijianchanpin")
public class JijianchanpinController {
    @Autowired
    private JijianchanpinService jijianchanpinService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JijianchanpinEntity jijianchanpin,
		HttpServletRequest request){
        EntityWrapper<JijianchanpinEntity> ew = new EntityWrapper<JijianchanpinEntity>();

		PageUtils page = jijianchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jijianchanpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JijianchanpinEntity jijianchanpin, 
		HttpServletRequest request){
        EntityWrapper<JijianchanpinEntity> ew = new EntityWrapper<JijianchanpinEntity>();

		PageUtils page = jijianchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jijianchanpin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JijianchanpinEntity jijianchanpin){
       	EntityWrapper<JijianchanpinEntity> ew = new EntityWrapper<JijianchanpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jijianchanpin, "jijianchanpin")); 
        return R.ok().put("data", jijianchanpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JijianchanpinEntity jijianchanpin){
        EntityWrapper< JijianchanpinEntity> ew = new EntityWrapper< JijianchanpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jijianchanpin, "jijianchanpin")); 
		JijianchanpinView jijianchanpinView =  jijianchanpinService.selectView(ew);
		return R.ok("查询计件产品成功").put("data", jijianchanpinView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JijianchanpinEntity jijianchanpin = jijianchanpinService.selectById(id);
        return R.ok().put("data", jijianchanpin);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JijianchanpinEntity jijianchanpin = jijianchanpinService.selectById(id);
        return R.ok().put("data", jijianchanpin);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JijianchanpinEntity jijianchanpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jijianchanpin);
        jijianchanpinService.insert(jijianchanpin);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JijianchanpinEntity jijianchanpin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jijianchanpin);
        jijianchanpinService.insert(jijianchanpin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JijianchanpinEntity jijianchanpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jijianchanpin);
        jijianchanpinService.updateById(jijianchanpin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jijianchanpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
