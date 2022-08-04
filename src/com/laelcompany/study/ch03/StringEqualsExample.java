package com.laelcompany.study.ch03;

public class StringEqualsExample {
	
	public static void main(String[] args) {
	
		String str1 = "박라엘";
		String str2 = "박라엘";
		String str3 = new String ("박라엘");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1=" + result1);   //true
		
		boolean result2 = (str1 == str3);
		System.out.println("result2=" + result2);   //false
		
		System.out.println("str1.equls(str2):" + str1.equals(str2)); //==(x) true
		System.out.println("rstr1.equls(str3):" + str1.equals(str3)); //==(x) true
		
	}
	
}
