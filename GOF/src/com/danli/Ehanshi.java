package com.danli;
/**
 * ����ʽ
 * ����Ч�ʸߣ�������ʱ����
 * @author sj
 *
 */
public class Ehanshi {
	private static Ehanshi instance=new Ehanshi();
	private Ehanshi() {
		}
	public static Ehanshi getinstance(){
		return Ehanshi.instance;
	}

}
