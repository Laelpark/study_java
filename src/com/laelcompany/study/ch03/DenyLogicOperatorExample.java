package com.laelcompany.study.ch03;

public class DenyLogicOperatorExample {
	
	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println(play);
		
//		논리부정연산자: ! (기존 블리언 값의 반대를 내는 연산자)
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		
		int j = 3;
		
		if(!(j==3)) {
			System.out.println("3이 아님");
		} else {
			System.out.println("3임");
		}
		
		
		
	}
	
}
