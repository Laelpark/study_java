package com.laelcompany.study.ch13.third;

public class Util {

//	public static void boxing(String a)
	public static <T> Box<T> boxing(T t) {
					// return값이 됨
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

// 위에 예문 쉽게 풀이한 것
	public String aaa (String name) {
		String xxxx = "";
		
		return xxxx;
	}
}
