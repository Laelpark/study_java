package com.laelcompany.study.ch06;

public class HyundaiExample {

	public static void main(String[] args) {

		Hyundai hyundai = new Hyundai();
	
	
//	System.out.println("name3[1] a : " + a.name3[0] );
//	System.out.println("name3[1] a : " + a.name3[1] );
//	System.out.println("name3[1] a : " + a.name3[2] );
	
		for(int i=0; i<hyundai.name3.length; i++){
			System.out.println("hyundai.name3[" + i + "] : " + hyundai.name3[i]);
		}
	
	
		
	}
}

	// 객체이름.필드명
	// ()있으면 함수, 없으면 변수