package com.laelcompany.study.ch06;

public class CarExample {

	public static void main(String[] args) {    // main : 실행함수

		Car abx = new Car();   //대,소문자도 잘 외워두기
//		int a = 1;
//		int b = 1;
		
//		int[] b = new int[1];
		
		System.out.println("car.name : " + abx.name);
		System.out.println("car.name2[1] : " + abx.name2[1]);
		
		Car car = new Car();
		
		System.out.println("car.name : " + car.name);
		System.out.println("car.name2[1] : " + car.name2[1]);
		
		car.name = "소나타";
		
		System.out.println("car name : " + car.name);
	}

}
