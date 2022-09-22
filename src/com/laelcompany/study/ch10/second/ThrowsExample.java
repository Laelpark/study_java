package com.laelcompany.study.ch10.second;

public class ThrowsExample {

	public static void findClass() throws ClassNotFoundException  {
									// throws: 실제 사용되는 곳에서 예외를 처리하라고 넘김
			Class clazz = Class.forName("java.lang.String2");
	}
		
		
		public static void main(String[] args) {
			try {
				findClass();
			} catch(ClassNotFoundException e) {
				System.out.println("클래스가 존재하지 않습니다.");
			}
		}
		
}