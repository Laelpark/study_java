package com.laelcompany.study.ch07.third;

public class TestCh extends Test {

	// 자식 클래스

//	@Override
//	public int result() {
//		System.out.println("합계");
//		return num[0] * num[1] + num[2] + 10;
//	}
	
	
	@Override
	public int getSum(int[] array) {
		sum = (array[0] * array[1]) + array[2] + 10;
		return sum;
	}
	
}
