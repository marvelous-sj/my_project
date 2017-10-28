package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.annotation.processing.SupportedAnnotationTypes;

@Annotable("tb_student")
public class Student {
	@Anno(sname="name",type="char",length=10)
	private String name;
	@Anno(sname="age",type="int",length =3)
	private int age;
	@Anno(sname="sex",type="char",length=4)
	private String sex;
	public Student(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
public static void main(String[] args) throws Exception {
	//�õ�һ����ע��
	Class clz=Student.class;
	Annotation a=clz.getAnnotation(Annotable.class);
	System.out.println(a);
	//��ҵ  �õ������ע��
	Class clazz=Student.class;
		Annotation[] annot=clazz.getAnnotations();
		for (Annotation b : annot) {
			System.out.println(b);
		}
	
	
	//�õ�name������ע��
	Field f=clz.getDeclaredField("name");
	Anno w=f.getAnnotation(Anno.class);
	System.out.println(w.sname());
	System.out.println(w.type());
	System.out.println(w.length());
	//��ҵ �õ� age������ע��
	Field ff=clazz.getDeclaredField("age");
	Anno z=ff.getAnnotation(Anno.class);
	System.out.println( z.sname()+z.type()+z.length());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//��ҵ �õ�sex������ע��
	
}
}
