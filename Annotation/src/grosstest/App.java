package grosstest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/*3.1:��ȡ��Ҫ���Ե��ֽ������
3.2:��ȡ�ֽ�������е����з���
3.3:�������ִ��в�ͬע��ķ���,��3��
3.4:��������Ҫִ�еķ���
      ������Ҫִ�еķ���ǰ��ִ��MyBeforeע��ķ���
      ������Ҫִ�еķ�������ִ��MyAfterע��ķ���*/
public class App {
	
	public static void main(String[] args) throws Exception {
		Method before=null;
		Method after=null;
		List<Method> list= new ArrayList<Method>();
		Class<?> clz=MyUnitTest.class;
		Object obj = clz.newInstance();
		Method[] ms = clz.getMethods();
		for (Method m : ms) {
			if(m.isAnnotationPresent(MyBefore.class)){
				before=m;
			}else if(m.isAnnotationPresent(MyAfter.class)){
				after=m;				
			}else if(m.isAnnotationPresent(MyTest.class)){
				list.add(m);
			}
		}
		for (Method md : list) {
			try {
				if(before!=null){
					before.invoke(obj);					
				}
				md.invoke(obj);
				if(after!=null){
					after.invoke(obj);					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			}
		}
	}

}
