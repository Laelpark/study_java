package com.laelcompany.study.ch07.third;

public class Computer extends Calculator{
	
	// 우 클릭 - 소스 - 오버라이드
	
//	@Override
//	public double areaCircle(double r) {
//		return super.areaCircle(r);
//	}

	// 부모 소스 복붙한거
	
	@Override
	public double areaCircle(double r) {
		System.out.println("computer 객체의 areaCircle 실행");
		
		return Math.PI * r * r;
	}
	
	

	
}
