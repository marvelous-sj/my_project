package com.danli;
/**
 * ����ʽ
 * ����Ч�ʵͣ�������ʱ����
 * @author sj
 *
 */
public class Lhanshi {
	private static Lhanshi instance=null;
	private Lhanshi() {
		// TODO Auto-generated constructor stub
	}
	public static Lhanshi getinstance(){
		if(instance==null){
			instance=new Lhanshi();
		}
		return instance;
	}
}
