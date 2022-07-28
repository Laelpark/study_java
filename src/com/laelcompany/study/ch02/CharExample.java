package com.laelcompany.study.ch02;

public class CharExample {

	public static void main(String[] args) {
		
//		char 타입을 사용시에는 작은 따음표 사용
//		자바는 모든 문자를 유니코드로 처리함. 국제 표준 규약
		
		char c1 = 'A';          // 문자를 저장
		char c2 = 65;           // 십진수로 저장
		char c3 = '\u0041';     // 16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';          // 문자를 저장
		char c5 = 44032;         // 십진수로 저장
		char c6 = '\uac00';      // 16진수로 저장
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int unicode = c1;
		System.out.println(unicode);
		
		int unicode2 = c4;
		System.out.println(unicode2);
	}
}