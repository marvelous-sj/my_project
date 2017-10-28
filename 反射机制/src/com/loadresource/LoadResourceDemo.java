package com.loadresource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadResourceDemo {
public static void main(String[] args) throws Exception {
	 //��ʽ1:ʹ�þ���·���ķ�ʽ����
	//test1();
	//��ʽ2:ʹ�����·��-�����classpath�ĸ�·�����ֽ������Ŀ¼��    ����
	//test2();
	test3();
	
	
}

private static void test3() throws Exception {
	Properties p=new Properties();
	InputStream inStream= LoadResourceDemo.class.getResourceAsStream("db.properties");
	p.load(inStream);
	System.out.println(p);
	
}

private static void test2() throws Exception {
	//��ʽ2:ʹ�����·��-�����classpath�ĸ�·�����ֽ������Ŀ¼��
	Properties p =new Properties();
	//ClassLoader loader=LoadResourceDemo.class.getClassLoader();
	ClassLoader loader =Thread.currentThread().getContextClassLoader();
	InputStream inStream= loader.getResourceAsStream("db.properties");
	p.load(inStream);
	System.out.println(p);
	
}

private static void test1() throws Exception {
	 //��ʽ1:ʹ�þ���·���ķ�ʽ����
	Properties p=new Properties();
	InputStream inStream=new FileInputStream("C:/Users/Administrator/Desktop/work/�������/resources/db.properties");
	p.load(inStream);
	System.out.println(p);
}
}
