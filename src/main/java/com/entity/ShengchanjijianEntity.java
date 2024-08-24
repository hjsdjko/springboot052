package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 生产计件
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
@TableName("shengchanjijian")
public class ShengchanjijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShengchanjijianEntity() {
		
	}
	
	public ShengchanjijianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengchanshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
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
