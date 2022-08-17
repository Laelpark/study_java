package com.laelcompany.study.ch05;

public class ArrayCreateByvalueListExample1 {

	public static void main(String[] args) {
			
		int[] scoreEnglish;
		int scoreMath[];
		
		int[] scoreChemistry = {88,99,45,86,34};
		
		String[] name = {"장원영", "장동건", "고소영"};
		
//		scoreChemistry의 평균을 구해서 출력하시오
//		System.out.println(scoreChemistry.length)
		
		double sum = 0;
		double avg = 0;
		
		for(int i=0; i<scoreChemistry.length; i++){
			sum += scoreChemistry[i];
		}
		avg = sum/scoreChemistry.length;
		System.out.println("평균값 : " + avg);
		
		
		
//		double sum = 0;
//		double avg = 0;
//		
//		for(int i=0; i<=4; i++){
//			sum += scoreChemistry[i];
//		}
//		avg = sum/5;
//		System.out.println("평균값 : " + avg);
		

		
		System.out.println("명지님 화학성적 : " + scoreChemistry[0]);
				
		System.out.println("이름 : " + name[2]);
		
		
		
	}
}
