package com.laelcompany.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week abc;    // 데이터 타입(int, String, long ...)을 스스로 만들어 사용함
		Week xyz;
		
//    데이터 타입에 맞게 호출을 하기
//		abc = 1;
//		abc = "asdfasf";
//		abc = 1.1;
		abc = Week.MONDAY;   // 이런식으로 참조하여 사용함
		
		System.out.println("Week.FRIDAY :" + Week.FRIDAY);
		System.out.println("abc :" + abc);
		
//		String name = abc; // 타입을 잘 맞춰야 함 안 그럼 오류
		String name = abc.name();
		System.out.println("name : " + name);
		
		int ordinal = abc.ordinal();   // Week의 인덱스값을 가져옴
		System.out.println("ordinal : " + ordinal);
		
		xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);  // 위에서 아래 방향은 -
		int result2 = xyz.compareTo(abc);  // 아래에서 위 방향은 +(생략)
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		Week[] days = Week.values();
		
		int index = 0;
		for(Week day: days) {
			System.out.println(index + ": day : " + day);
			index ++;
		}
	}
}
