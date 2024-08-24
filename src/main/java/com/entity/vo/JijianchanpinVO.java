package com.entity.vo;

import com.entity.JijianchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 计件产品
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
public class JijianchanpinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 生产单价
	 */
	
	private Double shengchandanjia;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：生产单价
	 */
	 
	public void setShengchandanjia(Double shengchandanjia) {
		this.shengchandanjia = shengchandanjia;
	}
	
	/**
	 * 获取：生产单价
	 */
	public Double getShengchandanjia() {
		return shengchandanjia;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
