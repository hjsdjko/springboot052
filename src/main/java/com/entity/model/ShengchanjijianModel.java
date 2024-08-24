package com.entity.model;

import com.entity.ShengchanjijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 生产计件
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
public class ShengchanjijianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 产品款号
	 */
	
	private String chanpinkuanhao;
		
	/**
	 * 生产件数
	 */
	
	private Integer shengchanjianshu;
		
	/**
	 * 生产单价
	 */
	
	private Double shengchandanjia;
		
	/**
	 * 计件备注
	 */
	
	private String jijianbeizhu;
		
	/**
	 * 生产时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchanshijian;
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：产品款号
	 */
	 
	public void setChanpinkuanhao(String chanpinkuanhao) {
		this.chanpinkuanhao = chanpinkuanhao;
	}
	
	/**
	 * 获取：产品款号
	 */
	public String getChanpinkuanhao() {
		return chanpinkuanhao;
	}
				
	
	/**
	 * 设置：生产件数
	 */
	 
	public void setShengchanjianshu(Integer shengchanjianshu) {
		this.shengchanjianshu = shengchanjianshu;
	}
	
	/**
	 * 获取：生产件数
	 */
	public Integer getShengchanjianshu() {
		return shengchanjianshu;
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
	 * 设置：计件备注
	 */
	 
	public void setJijianbeizhu(String jijianbeizhu) {
		this.jijianbeizhu = jijianbeizhu;
	}
	
	/**
	 * 获取：计件备注
	 */
	public String getJijianbeizhu() {
		return jijianbeizhu;
	}
				
	
	/**
	 * 设置：生产时间
	 */
	 
	public void setShengchanshijian(Date shengchanshijian) {
		this.shengchanshijian = shengchanshijian;
	}
	
	/**
	 * 获取：生产时间
	 */
	public Date getShengchanshijian() {
		return shengchanshijian;
	}
			
}
