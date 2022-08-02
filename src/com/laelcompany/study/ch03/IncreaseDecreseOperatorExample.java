package com.laelcompany.study.ch03;

public class IncreaseDecreseOperatorExample {
	
	public static void main(String[] args) {
		
// ++/-- 피연산자 : 다른 연산 수행 전에 피연산자 1증가/감소  -> 앞에 있다, 증감 먼저
// 피연산자 ++/-- : 다른 연산 수행 후에 피연산자 1증가/감소
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		
//		int 변수 a,b를 선언하고 초기값으로 1을 넣어 준다.
//		a 앞에 감소연산
//		b 뒤에 감소연산
//		두 변수에 결과를 출력

		int a = 1;
		int b = 1;
		--a;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		
//		int 변수 k 선언 후 초기값으로 i 뒤에 증감연산
		
		int k = i++; 
//		int k = ++i;
	
		System.out.println(k);
		System.out.println(i);
		
		int m = ++j;
		
		System.out.println(m);
		System.out.println(j);
		
		
		int z = ++i + j++;  
//		z:5 i:3 j:2  전체 연산했을 때의 각 값
//		z:5 i:3 j:3  따로 연산했을 때 각 값
		
		System.out.println(z);
		System.out.println(i);
		System.out.println(j);
	}
	
}
