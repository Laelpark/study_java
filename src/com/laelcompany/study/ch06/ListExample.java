package com.laelcompany.study.ch06;

public class ListExample {

	public static void main(String[] args) {
	
		
//		List list = new List();
//		System.out.println("이름: " + list.name + "   " + "조회수: " +list.num+ "   " + "사용여부: " +list.use);

		
//		List L1 = new List("장원영");
//		System.out.println("L1.name : " + L1.name);
//		System.out.println("L1.num : " + L1.num);
//		System.out.println("L1.use : " + L1.use);
//		
//		List L2 = new List("장원영", 128);
//		System.out.println("L2.name : " + L2.name);
//		System.out.println("L2.num : " + L2.num);
//		System.out.println("L2.use : " + L2.use);
//		
//		List L3 = new List("장원영", true);
//		System.out.println("L3.name : " + L3.name);
//		System.out.println("L3.num : " + L3.num);
//		System.out.println("L3.use : " + L3.use);
//		
//		List L4 = new List("장원영", 128, false);
//		System.out.println("L4.name : " + L4.name);
//		System.out.println("L4.num : " + L4.num);
//		System.out.println("L4.use : " + L4.use);
	

		// 출력은 간단해 보이게 만들기
		
		List list = new List();
		list.print();
		
		List L1 = new List("장원영");
		L1.print();
		
		List L2 = new List("장원영", 128);
		L2.print();
		
		List L3 = new List("장원영", true);
		L3.print();
		
		List L4 = new List("장원영", 128, false);
		L4.print();
		

	}

}
