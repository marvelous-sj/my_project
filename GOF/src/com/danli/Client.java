package com.danli;

import java.lang.reflect.Constructor;

public class Client {
   
     public static void main(String[] args) throws Exception {
    	  Lhanshi s1=Lhanshi.getinstance();
    	  Lhanshi s2=Lhanshi.getinstance();
    	  System.out.println(s1);
    	  System.out.println(s2);
    	  
    	  Singleton a1= Singleton.getinstance();
    	  Singleton a2= Singleton.getinstance();
    	  System.out.println(a1);
    	  System.out.println(a2);
    	  System.out.println("----------------------------------------");
    	  //ö��
    	System.out.println( Meiju.instance);
    	System.out.println( Meiju.instance);
    	  
    	  System.out.println("----------------------------------------");
    	  //ʹ�÷����ȡ���������ƻ�����
    	  Class clz =Singleton.class;
    	  Constructor c= clz.getDeclaredConstructor();
    	  c.setAccessible(true);
    	  System.out.println(c.newInstance());
    	  System.out.println(c.newInstance());
    	  //��ҵ ʹ�÷����л��ķ�ʽ���ƻ�����
    	  
    	  
	}
}
