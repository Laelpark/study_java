package com.laelcompany.study.ch07.third;

import java.util.Arrays;

public class Test {
	// 부모 클래스

//
//	int[] num = {1, 2, 3};
//
//	
//	void arrs() {
//		Arrays.sort(num);
//		System.out.println("오름차순으로 정렬합니다.");
//	}
//	
//	public int result() {
//		System.out.println("합계");
//		return num[0] * num[1] + num[2];
//	}
	
	int sum = 0;
	int[] arr = new int[3];
	
	
	// 오름차순 정렬
	public void SortByAsc(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[1];
					arr[i] = arr[j];
					arr[j] = tmp;
				} 
			}
		}
	}
	public int getSum(int arr[]) {
		sum = (arr[0] * arr[1])+arr[2];
		return sum;
	}
	
	
	public void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println(" ");
	}
	
}



