package com.laelcompany.study.ch04;

public class IfExample4 {
	
	public static void main(String[] args) {
		
		int a = 4;
		
//		if(a!=1) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}
		
		if(a != 0) {
			if(a%2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else {
//			a==0
			System.out.println("0은 홀짝을 판단할 수 없습니다.");
		}
		
		
	}
}

	