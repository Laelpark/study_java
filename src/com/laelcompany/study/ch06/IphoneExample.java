package com.laelcompany.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {

	Iphone a = new Iphone();
	
	System.out.println("Iphone a : " + a.name );

	a.pr();
	
	Car car = new Car();
	
	System.out.println("car.name : " + car.name);
	
	Bag b = new Bag();    // 외우기
	System.out.println("Bag name : " + b.name);
	
	car.name = "소나타";
	
	System.out.println("car name : " + car.name);
		
	}

}

	// 객체이름.필드명
	// ()있으면 함수, 없으면 변수