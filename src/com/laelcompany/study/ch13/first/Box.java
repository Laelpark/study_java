package com.laelcompany.study.ch13.first;

public class Box <T> {

//	private T t;	// 데이터 타입을 지금 정하지 않고 나중에 사용할때 정하겠다.
//	private String a;

//	public T get() {
//		return t;
//	}
//
//	public void set(T t) {
//		this.t = t;
//	}
//	
//	public void out () {
//		System.out.println("output");
//	}

	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
	public void out () {
		System.out.println("output");
	}
	
}
