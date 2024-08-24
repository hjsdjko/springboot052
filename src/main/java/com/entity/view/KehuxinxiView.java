package com.entity.view;

import com.entity.KehuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 客户信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
@TableName("kehuxinxi")
public class KehuxinxiView  extends KehuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KehuxinxiView(){
	}
 
 	public KehuxinxiView(KehuxinxiEntity kehuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kehuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
