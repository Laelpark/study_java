package com.laelcompany.study.ch07.fifth;

public abstract class Phone {
	   // 추상 //
	

	// 필드
	public String owner;
	
	// 생산자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	Phone() {
		
	}
	
	//메소드
	public void trunOn() {
		System.out.println(owner + "가 폰전원을 켭니다.");
	}
	public void trunOff() {
		System.out.println("폰전원을 끕니다.");
	}
}
