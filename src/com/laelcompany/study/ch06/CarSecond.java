package com.laelcompany.study.ch06;

public class CarSecond {

	
	String name = "아반떼";
	int cc = 1500;
	String color = "red";
	
//	CarSecond(String str) {
//		name = str;
//	}
//	
//	CarSecond(String str, int num) {
//		name = str;
//		cc = num;
//	}
//	
//	
//	CarSecond(String str, int num, String stl) {
//		name = str;
//		cc = num;
//		color = stl;
//	}
	
	// 기본생성자
	CarSecond() {
		
	}
	
	CarSecond(String name) {
		this.name = name;
	}
	
	CarSecond(String name, int cc) {
		this.name = name;
		this.cc = cc;
	}
	
	
	CarSecond(String name, int cc, String color) {
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	
	CarSecond(int ccvalue) {
		this.cc = ccvalue;
	}
}
