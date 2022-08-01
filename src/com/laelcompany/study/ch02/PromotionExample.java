package com.laelcompany.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
	
//		자동 타입 변환 (promotion)
//		작은 형이 큰형으로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변하면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다.
//		byte < short < int < long < float < double
		
//		작은 byte에서 큰 int타입으로 변환 가능
		
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue + " 입니다.");
		                 // 문자열을 보이고 싶으면 "" 안에다 넣고 싶은 문자
		
		int intValue = byteValue;    // 10
		System.out.println("intValue: " + intValue);
		
//		------------------------
		
//		큰 타입인 int에서 작은 타입인 byte로 변환은 불가능
		
//		int intValue2 = 1234567890;
//		System.out.println("intValue: " + intValue);
		
//		byte byteValue2 = intValue2;
//		System.out.println("byteValue: " + byteValue + "입니다.");
		
		int intValue3 = 200;
		System.out.println("intValue3:" + intValue3 + " 입니다.");
		
		double doubleValue = intValue3;
		System.out.println("doubleValue:" + doubleValue + " 입니다.");
		
//      int에 short 대입 후 출력
		short shortValue = 10;
		int intValue1 = shortValue;
		System.out.println("inttValue: " + intValue1);
		
//      long에 int 대입 후 출력	
		long longValue = intValue1;
		System.out.println("longValue: " + longValue);
		
//      float에 long 대입 후 출력	
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
//      double에 float 대입 후 출력	
		double doubleValue1 = floatValue;
		System.out.println("doubleValue1: " + doubleValue1);
		
		
	}
}