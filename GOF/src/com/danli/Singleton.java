package com.danli;
/**
 * ��̬�ڲ��� 
 * ����Ч�ʸߣ���ʱ����
 * @author sj
 *
 */
public class Singleton {
	private static class siglentonclass{
		private static Singleton instance=new Singleton();
	}
	public static Singleton getinstance(){
		
		return siglentonclass.instance;
	}
	
	
	private Singleton() {
		// ��ֹ�����ƻ�����
		if(siglentonclass.instance !=null){
		//	throw new RuntimeException();
			System.out.println("����");
		}
	}

}
