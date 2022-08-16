package com.laelcompany.study.ch04;

public class DoWhileExample {

	public static void main(String[] args) {
			
		int i = 1;
		int sum = 0;   // 덧셈은 초기값 0, 곱셈은 초기값 1
		
		do {
			sum += i;
			System.out.println(i + " : " + sum);
			i++;
		} while (i <=10);
		
	}
}
