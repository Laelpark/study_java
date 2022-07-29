package com.laelcompany.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
	
//		작은 형이 큰형으로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변하면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다.
//		byte < short < int < long < float < double
		
//		작은 byte에서 큰 int타입으로 변환 가능
		
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue + "입니다.");
		                 // 문자열을 보이고 싶으면 "" 안에다 넣고 싶은 문자
		
		int intValue = byteValue;    // 10
		System.out.println("intValue: " + intValue);
		
//		------------------------
		
//		큰 타입인 int에서 작은 타입인 byte로 변환은 불가능
		
//		int intValue2 = 1234567890;
//		System.out.println("intValue: " + intValue);
		
//		byte byteValue2 = intValue2;
//		System.out.println("byteValue: " + byteValue + "입니다.");
		
	}
}