package com.laelcompany.study.ch04;

import java.util.Scanner;

public class IfExample5 {
	
	public static void main(String[] args) {
		
//		int 타입의 변수를 2 선헌하고,
//		두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램을 작성시오
		
		int a = -2;
		int b = 0;
		
		if(a>0 && b>0) {
			System.out.println("1");
		}else if (a<0 && b>0) {
			System.out.println("2");
		}else if (a<0 && b<0) {
			System.out.println("3");
		}else if (a>0 && b<0) {
			System.out.println("4");
		}else if (a==0 && b!=0) {
			System.out.println("x");
		}else if (a!=0 && b==0) {
			System.out.println("y");
		}else {
			// a==0 & b==0
			System.out.println("원점");
		}
		
	}
}

	