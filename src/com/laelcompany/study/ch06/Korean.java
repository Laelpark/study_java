package com.laelcompany.study.ch06;

public class Korean {

	String name;
	String ssn;
	String num;
	int age;
	
	
	
	// 오버로드 : 한 구문으로 여러개의 출력을 낼 수 있는 것
	
	Korean() {
		
	}
	
	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Korean(String name, String ssn, String num) {
		this.name = name;
		this.ssn = ssn;
		this.num = num;
	}
	
	static String nationality = "대한민국";
	
	static int staticTest (int a) {
		return a + 10; 
	}
	
//	int staticTest2 (int a) {
//		return a - 10;
//	}
	
	int ttest ( ) {
		Arithmetic arithmetic = new Arithmetic();
		arithmetic.aaa(12);
		return 1;
	}
	
	public void ttest2() {
		
//		Arithmetic arithmetic = new Arithmetic();
//		arithmetic.staticTest();
		
		Arithmetic.staticTest();
	}
	
}
