package com.laelcompany.study.ch07;

public class Computer extends Calculator{

	@Override
	public double calc(int r) {
		
		double result = r * r * constants.PA_2;
		return result;
	}

}