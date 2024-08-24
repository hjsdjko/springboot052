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
 * 货款信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
@TableName("huokuanxinxi")
public class HuokuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuokuanxinxiEntity() {
		
	}
	
	public HuokuanxinxiEntity(T t) {
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
	 * 客户姓名
	 */
					
	private String kehuxingming;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 产品款号
	 */
					
	private String chanpinkuanhao;
	
	/**
	 * 所欠货款
	 */
					
	private Double suoqianhuokuan;
	
	/**
	 * 总计货款
	 */
					
	private Double zongjihuokuan;
	
	/**
	 * 货款备注
	 */
					
	private String huokuanbeizhu;
	
	
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
	 * 设置：客户姓名
	 */
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
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
	 * 设置：所欠货款
	 */
	public void setSuoqianhuokuan(Double suoqianhuokuan) {
		this.suoqianhuokuan = suoqianhuokuan;
	}
	/**
	 * 获取：所欠货款
	 */
	public Double getSuoqianhuokuan() {
		return suoqianhuokuan;
	}
	/**
	 * 设置：总计货款
	 */
	public void setZongjihuokuan(Double zongjihuokuan) {
		this.zongjihuokuan = zongjihuokuan;
	}
	/**
	 * 获取：总计货款
	 */
	public Double getZongjihuokuan() {
		return zongjihuokuan;
	}
	/**
	 * 设置：货款备注
	 */
	public void setHuokuanbeizhu(String huokuanbeizhu) {
		this.huokuanbeizhu = huokuanbeizhu;
	}
	/**
	 * 获取：货款备注
	 */
	public String getHuokuanbeizhu() {
		return huokuanbeizhu;
	}

}
