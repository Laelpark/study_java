package com.laelcompany.study.ch04;

public class RandomSum {
	
	public static void main(String[] args) {
		
	// 1~100 사이의 랜덤 정수 2개를 발생시켜
	// 두 수 사이의 합을 구하라

		
			
			double min = 1.0;
			double max = 100.0;
			int random = (int) ((Math.random() * (max - min)) + min);
			System.out.println(random);
		
			double min2 = 1.0;
			double max2 = 100.0;
			int random2 = (int) ((Math.random() * (max2 - min2)) + min2);
			System.out.println(random2);
			
			System.out.println(random + random2);
			
	}
}

	