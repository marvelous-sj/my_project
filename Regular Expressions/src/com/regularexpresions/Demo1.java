package com.regularexpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����������ʽ
 * @author sj
 *
 */
public class Demo1 {
public static void main(String[] args) {
	Pattern p= Pattern.compile("\\d+");
	Matcher m=p.matcher("sdf5sdf3fa15e");
	while(m.find()){
		System.out.println(m.group());
	}
}
}
