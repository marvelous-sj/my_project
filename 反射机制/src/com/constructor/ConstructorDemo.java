package com.constructor;

import java.lang.reflect.Constructor;

class person{
	public person(){
		System.out.println("�޲ι�����");
	}
	public person(String name){
		System.out.println("name:"+name);
	}
	private person(String name, int age){
		System.out.println("name:"+name+"age:"+age);
	}
}
public class ConstructorDemo {
public static void main(String[] args) throws Exception {
	//�����޲ι���
	Class<person> clz=person.class;
	Constructor<person> con= clz.getConstructor();
	con.newInstance();
	//�Ϸ���
	//new person();
	//���õڶ���������
	Class<person> clz1=person.class;
	Constructor<person> con1=clz1.getConstructor(String.class);
	con1.newInstance("sj");
	//���õ�����������
	Class<person> clz2=person.class;
	//����private��ʱ�򣬲�Ҫ���Ǽ���Declared
	Constructor<person> con2=clz2.getDeclaredConstructor(String.class,int.class);
	con2.setAccessible(true);
	con2.newInstance("sj",20);
	
	
}
}
