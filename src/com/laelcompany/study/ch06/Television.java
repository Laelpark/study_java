package com.laelcompany.study.ch06;

public class Television {

	public static String company = "samsung";
	public static String model = "OLED";
	static String info;    // 앞에 public 없어도 무관
	
	public String version = "1.0";
	
	static {
		info = company + " " + model;
	}
	
}
