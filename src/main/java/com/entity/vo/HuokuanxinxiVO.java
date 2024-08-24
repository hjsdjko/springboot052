package com.entity.vo;

import com.entity.HuokuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 货款信息
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
public class HuokuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
