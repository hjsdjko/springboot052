package com.entity.view;

import com.entity.JijiangongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 计件工资
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-12 10:07:25
 */
@TableName("jijiangongzi")
public class JijiangongziView  extends JijiangongziEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JijiangongziView(){
	}
 
 	public JijiangongziView(JijiangongziEntity jijiangongziEntity){
 	try {
			BeanUtils.copyProperties(this, jijiangongziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
