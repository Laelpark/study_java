package com.laelcompany.study.ch04;

public class ForExample {

	public static void main(String[] args) {
			
		

		for(int i=1; i<=5; i++) {
			for (int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("==========================");
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=10; j++) {
				if(i==1 || i==5) {
					System.out.print("*");
				}else {
					if(j==1 || j==10) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		
		System.out.println("==========================");
		
		
		for(int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
				if(i==10) {
					if (j==10) {
						System.out.print(0);
					}else if(j%2==0) {
						System.out.print(" ");
					}else {
						System.out.print(j);
					}
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
		


		
//	for(int i=1; i<=5; i++) {
//		for (int j=1; j<=10; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	
//	System.out.println("==========================");
//	
//	for(int i=1; i<=5; i++) {
//		for (int j=1; j<=10; j++) {
//			if(i>=2 && i<=4) {
//				if(j>=2 && j<=9) {
//					System.out.print(" ");
//				} else
//				System.out.print("*");
//			}else {
//					System.out.print("*");
//			}
//		}
//		System.out.println();
//	}
//
//	System.out.println("==========================");
//	
//		
//			for(int i=1; i<=10; i++) {
//				if(i==10) {
//					for (int j=1; j<=i; j++) {
//						if (j%2==1) {
//							System.out.print(j);
//						}else {
//							System.out.print(" ");
//						}
//					}
//					System.out.print("0");
//				} else {
//					for(int j=1; j<=i; j++) {
//						System.out.println(j);
//					}
//					System.out.println();
//				}
//			}
//		}
//	}
//			
		
	
	
	
	
	
	