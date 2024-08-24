package com.entity.view;

import com.entity.ChanpinrukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 产品入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-12 10:07:26
 */
@TableName("chanpinruku")
public class ChanpinrukuView  extends ChanpinrukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChanpinrukuView(){
	}
 
 	public ChanpinrukuView(ChanpinrukuEntity chanpinrukuEntity){
 	try {
			BeanUtils.copyProperties(this, chanpinrukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
