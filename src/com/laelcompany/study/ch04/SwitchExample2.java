package com.laelcompany.study.ch04;

public class SwitchExample2 {
	
	public static void main(String[] args) {
		
//		일반:1, 5% 할인적용
//		브론즈:2, 10% 할인적용
//		실버:3, 15% 할인적용
//		골드:4, 20% 할인적용
//		플래티넘:5, 2.7% 할인적용
		
//		정가 : 할인가
		
		int grade = 3;
		int cost = 12000;
		double salesCost = 0.0;
		
		switch(grade) {
			case 1:
				salesCost = cost*(1-0.05);
				System.out.println("정가" + cost + "원인 일반 등급의 할인가는:" + (int) salesCost + "원 입니다.");
				break;
			case 2:
				salesCost = cost*(1-0.1);
				System.out.println("정가" + cost + "원인 일반 등급의 할인가는:" + (int) salesCost + "원 입니다.");
				break;
			case 3:
				salesCost = cost*(1-0.15);
				System.out.println("정가" + cost + "원인 일반 등급의 할인가는:" + (int) salesCost + "원 입니다.");
				break;
			case 4:
				salesCost = cost*(1-0.2);
				System.out.println("정가" + cost + "원인 일반 등급의 할인가는:" + (int) salesCost + "원 입니다.");
				break;
			case 5:
				salesCost = cost*(1-0.027);
				System.out.println("정가" + cost + "원인 일반 등급의 할인가는:" + (int) salesCost + "원 입니다.");
				break;	
			default:          //가급적이면 default넣어주기
				System.out.println("1~5까지의 grade만 가능합니다.");
				break;
		}

	
		
	}
}

	