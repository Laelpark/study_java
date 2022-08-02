package com.laelcompany.study.ch03;

public class ArithmeticOperatorExample {
	
	public static void main(String[] args) {
		
//		int 변수 v1에 초기값 5
//		int 변수 v2에 초기값 2
		
		int v1 = 5;
		int v2 = 2;
		
//		int 변수 result1에 + 연산 후 출력
//		int 변수 result2에 - 연산 후 출력
//		int 변수 result3에 * 연산 후 출력
//		int 변수 result4에 / 연산 후 출력
//		int 변수 result5에 % 연산 후 출력
	
		int result1 = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
//		사칙연산 중 가장 중요한 것이니 꼭 기억하고 암기
		
		double result6 =  v1 / v2;
		System.out.println(result6);
		
		double result7 = (double) v1 / v2;
		System.out.println(result7);
		
	}
	
}
