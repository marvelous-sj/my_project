package com.xiancheng;
class Appleone implements Runnable{
	private int apple=50;

	public void run() {
		
		for (int i = 0; i < 50; i++) {
			if(apple>0)
			{
				System.out.println(Thread.currentThread().getName()+"���˵� "+ apple-- + "��ƻ��");
			}
			
	}
	
}
}
public  class eatapple2 {
   public static void main(String[] args) {
	
	Appleone sj=new Appleone();
	new Thread (sj,"A").start();
	new Thread(sj,"B").start();
	new Thread(sj,"C").start();
}
}
