package com.laelcompany.study.ch03;

public class CompareOperatorExample {
	
	public static void main(String[] args) {
	
		// 서로 다른 두 수 만들고 비교하고 boolean 타입으로 출력
		
		int num1 = 1;
		int num2 = 5;
		
//		==
		
		boolean result = (num1 == num2);
		System.out.println(result);
		
//	같지 않다	!=
		
		boolean result1 = (num1 != num2);
		System.out.println(result1);
		
//		<
		
		boolean result2 = (num1 < num2);
		System.out.println(result2);
		
//		<=
		
		boolean result3 = (num1 <= num2);
		System.out.println(result3);
		
//		>
		
		boolean result4 = (num1 > num2);
		System.out.println(result4);
		
//		>=
		
		boolean result5 = (num1 >= num2);
		System.out.println(result5);
		
	}
	
}
