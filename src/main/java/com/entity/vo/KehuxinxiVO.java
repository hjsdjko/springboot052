package com.entity.vo;

import com.entity.KehuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 客户信息
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public class KehuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 收件地址
	 */
	
	private String shoujiandizhi;
		
	/**
	 * 托运站名称
	 */
	
	private String tuoyunzhanmingcheng;
		
	/**
	 * 银行账户
	 */
	
	private String yinxingzhanghu;
		
	/**
	 * 电子邮箱
	 */
	
	private String dianziyouxiang;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：收件地址
	 */
	 
	public void setShoujiandizhi(String shoujiandizhi) {
		this.shoujiandizhi = shoujiandizhi;
	}
	
	/**
	 * 获取：收件地址
	 */
	public String getShoujiandizhi() {
		return shoujiandizhi;
	}
				
	
	/**
	 * 设置：托运站名称
	 */
	 
	public void setTuoyunzhanmingcheng(String tuoyunzhanmingcheng) {
		this.tuoyunzhanmingcheng = tuoyunzhanmingcheng;
	}
	
	/**
	 * 获取：托运站名称
	 */
	public String getTuoyunzhanmingcheng() {
		return tuoyunzhanmingcheng;
	}
				
	
	/**
	 * 设置：银行账户
	 */
	 
	public void setYinxingzhanghu(String yinxingzhanghu) {
		this.yinxingzhanghu = yinxingzhanghu;
	}
	
	/**
	 * 获取：银行账户
	 */
	public String getYinxingzhanghu() {
		return yinxingzhanghu;
	}
				
	
	/**
	 * 设置：电子邮箱
	 */
	 
	public void setDianziyouxiang(String dianziyouxiang) {
		this.dianziyouxiang = dianziyouxiang;
	}
	
	/**
	 * 获取：电子邮箱
	 */
	public String getDianziyouxiang() {
		return dianziyouxiang;
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
