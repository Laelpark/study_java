package com.laelcompany.study.ch07.third;

public class TestExample {
	
	public static void main(String[] args) {
		// 실행 클래스
		
		
		Test sortFirst = new Test();
		
		TestCh sortsecond = new TestCh();
	
		int[] arr = {10, 20, 30};
		
		System.out.println("------정렬전-----");
		sortFirst.printArr(arr);
		System.out.println("------정렬후-----");
		sortFirst.SortByAsc(arr);
		sortFirst.printArr(arr);
		
		System.out.println("------부모메서드2-----");
		System.out.println(sortFirst.getSum(arr));
					
		System.out.println("------자식메서드2-----");
		System.out.println(sortsecond.getSum(arr));
		
		System.out.println("------값 차이-----");
		System.out.println(sortFirst.getSum(arr) -sortsecond.getSum(arr));
	}
	
	
//	int a = 1;
//	int a = 2;
//	int a = 3;

}
