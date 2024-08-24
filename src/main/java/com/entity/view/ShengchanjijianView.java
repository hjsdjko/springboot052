package com.entity.view;

import com.entity.ShengchanjijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 生产计件
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
@TableName("shengchanjijian")
public class ShengchanjijianView  extends ShengchanjijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengchanjijianView(){
	}
 
 	public ShengchanjijianView(ShengchanjijianEntity shengchanjijianEntity){
 	try {
			BeanUtils.copyProperties(this, shengchanjijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
