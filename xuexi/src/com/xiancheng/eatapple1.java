package com.xiancheng;
class Apple extends Thread{
	private static int  num = 50;//����static �Ͳ���

		public Apple(String name) {
		// TODO Auto-generated constructor stub
			super(name);
	}

		public void run() {
		
		for (int i = 0; i < 50; i++) {
			if(num>0)
			{
				System.out.println(super.getName()+"���˵� "+ num-- + "��ƻ��");
			}
			
		}
	}
}


public class eatapple1 {
	
	
	
     public static void main(String[] args) {
		new Apple("A").start();
		new Apple("B").start();
		new Apple("C").start();
	}
}
