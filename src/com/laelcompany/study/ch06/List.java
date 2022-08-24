package com.laelcompany.study.ch06;

public class List {

	List() {
		
	}
	
	String name = "박라엘";
	int num = 128;
	Boolean use = true;
	
	
	List(String name) {
		this.name = name;
	}
		
	List(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	List(String name, Boolean use) {
		this.name = name;
		this.use = use;
	}
	
	List(String name, int num, Boolean use) {
		this.name = name;
		this.num = num;
		this.use = use;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("num : " + num);
		System.out.println("use : " + use);
	}
	
}
