package com.laelcompany.study.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
			
		// 초기값이 없고 중간에 값을 넣을 경우 
		
		int[] arr1 = new int[3];    // 사다리가 몇 칸인지 [] 안에 꼭 써주기
		
		int[] arr2;                 // 같은 내용이지만 방법이 2가지 
		arr2 = new int[5];
		
		arr1[0] = 77;
		arr1[1] = 78;
		arr1[2] = 79;
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		
	}
}
