package com.laelcompany.study.ch07.sixth;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	
	public abstract void sound();
	public abstract void sound(String m);
	
	// abstract은 안에 내용(함수)을 넣을 수 없음
	
}
