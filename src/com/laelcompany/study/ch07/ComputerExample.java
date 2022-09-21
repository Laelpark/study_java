package com.laelcompany.study.ch07;

public class ComputerExample {

	public static void main(String[] args) {

		int r= 7;
		System.out.println("원의 반지름 : " + r);
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.calc(r));
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.calc(r));
	}
}

