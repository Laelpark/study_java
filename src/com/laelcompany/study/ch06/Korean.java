package com.laelcompany.study.ch06;

public class Korean {

	String name;
	String ssn;
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
}
