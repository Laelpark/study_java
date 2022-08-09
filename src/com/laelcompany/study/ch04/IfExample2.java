package com.laelcompany.study.ch04;

public class IfExample2 {
	
	public static void main(String[] args) {
		
//		일반:1, 5% 할인적용
//		브론즈:2, 10% 할인적용
//		실버:3, 15% 할인적용
//		골드:4, 20% 할인적용
//		플래티넘:5, 2.7% 할인적용
		
//		정가 : 할인가
		
		int grade = 1;
		int cost = 10000;
		double salesCost= 0.0;
		
		if(grade == 1) {
			salesCost = cost*(1-0.05);
			System.out.println("정가" + cost + "원인 일반 등급의 할인가는:" + (int) salesCost + "원 입니다.");
		} else if(grade == 2) {
			System.out.println("정가" + cost + "원인 브론즈 등급의 할인가는:" + (int) cost*(1-0.1) + "원 입니다.");
		} else if(grade == 3) {
			System.out.println("정가" + cost + "원인 실버 등급의 할인가는:" + (int) cost*(1-0.15) + "원 입니다.");
		} else if(grade == 4) {
			System.out.println("정가" + cost + "원인 골드 등급의 할인가는:" + (int) cost*(1-0.2) + "원 입니다.");
		} else if(grade == 5) {
			System.out.println("정가" + cost + "원인 플래티넘 등급의 할인가는:" + (int) cost*(1-0.027) + "원 입니다.");
		} else {
			System.out.println("1~5까지의 grade만 가능합니다.");
		}
	
		
	}
}

	