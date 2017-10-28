package javabeantandmap;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * javabean �� map ֮���ת��
 * @author sj
 * 
 */
public class BeanUtil {
	//��JavaBeanת��ΪMap����.
	   public static Map<String,Object> bean2map(Object bean) throws Exception{
		  Map<String,Object> map= new HashMap<String,Object>();
		    Class<?> clz = bean.getClass();
		    BeanInfo info = Introspector.getBeanInfo(clz,Object.class);
		    PropertyDescriptor[] pds = info.getPropertyDescriptors();
		    for (PropertyDescriptor pd : pds) {
		    	//��ȡkey
				String key = pd.getName();
				//��ȡvalue
				Method method = pd.getReadMethod();
				Object value = method.invoke(bean);
				map.put(key, value);
			}
		   return map;
	   	}
	//��Map����ת��ΪJavaBean.
	   public static <T> T map2bean(Map<String,Object> beanMap,Class<T> beanType) throws Exception{
		   T obj = beanType.newInstance();
		   BeanInfo info = Introspector.getBeanInfo(beanType,Object.class);
		   PropertyDescriptor[] pds = info.getPropertyDescriptors();
		   for (PropertyDescriptor pd : pds) {
			//��ȡmap
			 String key = pd.getName();
			//��ȡvalue
			 Object value = beanMap.get(key);
			Method method = pd.getWriteMethod();
			method.invoke(obj,value);
		}
		 return obj;  
	   }
}
