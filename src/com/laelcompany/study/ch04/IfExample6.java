package com.laelcompany.study.ch04;

public class IfExample6 {
	
	public static void main(String[] args) {
		
		
//		최솟값 최댓값 구하기
		
		int a = 3;
		int b = 2;
		int c = 1;
		
		if(a != b && b != c && c != a) {
			if(a<b && a<c) {
				System.out.println("a가 가장 작다");
			}else if (b<a && b<c) {
				System.out.println("b가 가장 작다");
			}else {
				System.out.println("c가 가장 작다");
			}
			
				
			if (a>b && a>c){
				System.out.println("a가 가장 크다");
			}else if (b>a && b>c) {
				System.out.println("b가 가장 크다");
			}else {
				System.out.println("c가 가장 크다");
			}
			
			}else {
				System.out.println("적어도 2개의 통일한 정수가 존재합니다. 수정해주세요.");
			}

	}
}

	