package com.laelcompany.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
			
		int[][] scores = {
				{33,88,55}, 
				{99,77,66}, 
				{44,22,11}, 
				{12,13,14}, 
				{21,22,23}};
		
		System.out.println("scores[3][0]: " + scores[3][0]);
	
		// 개인의 평균과 과목별 평균 계산하시오
		
		double s1=0, s2=0, s3=0, s4=0, s5=0;
		double avg4 = 0, avg5 = 0, avg6 = 0, avg7 = 0, avg8 = 0;
		
		for (int j=0; j<3; j++) {
			s1 += scores[0][j];
			s2 += scores[1][j];
			s3 += scores[2][j];
			s4 += scores[3][j];
			s5 += scores[4][j];
		}
		
		avg4 = s1/3;
		avg5 = s2/3;
		avg6 = s3/3;
		avg7 = s4/3;
		avg8 = s5/3;
		
		System.out.println("1번 평균값 : " + avg4);
		System.out.println("2번 평균값 : " + avg5);
		System.out.println("3번 평균값 : " + avg6);
		System.out.println("4번 평균값 : " + avg7);
		System.out.println("5번 평균값 : " + avg8);

		System.out.println("-------------------------------");
		
		double kor=0, eng=0, math=0;
		double avg1 = 0, avg2 = 0, avg3 = 0;
		
		for(int i=0; i<scores.length; i++){
			kor += scores[i][0];
			eng += scores[i][1];
			math += scores[i][2];
		}

		avg1 = kor/scores.length;
		avg2 = eng/scores.length;
		avg3 = math/scores.length;
		
		System.out.println("국어 평균값 : " + avg1);
		System.out.println("영어 평균값 : " + avg2);
		System.out.println("수학 평균값 : " + avg3);
		
//		System.out.println("-----------다른분 답--------------");
		
//		
//		String[] name = {"한찬구","장동건","고소영","박태환","싸이"};
//		String[] subject = {"국어","영어","수학"};
//		
//		
//		// 1 개인의 평균
//		
//		for(int i=0; i<scores.length; i++) {
//			int sum=0;
//			for(int j=0; j<scores[i].length; j++) {
//				sum +=scores[i][j];
//			}
//			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
////			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/scores[i].length));
//		}
//		
//		System.out.println("------------------------------");
		
//		// 2 과목별 평균
//		for(int j=0; j<3; j++) {
//			int sum=0;
//			for(int i=0; i<5; i++) {
//				sum +=scores[i][j];
//			}
//			System.out.println(subject[j]+" 과목의 평균 점수는: "+((double)sum/5));
//		}
//	
		
		int[][] score = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
		String[] name = {"장원영", "장동건", "고소영", "박태환", "싸이"};
		String[] subject = {"국어", "영어", "수학"};
		
		
		
	}
}
