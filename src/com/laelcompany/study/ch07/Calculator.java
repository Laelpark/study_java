package com.laelcompany.study.ch07;

public class Calculator{
	
	Constants constants = new Constants();
	
	public double calc(int r) {
					// param (-) 이 자체를 의미 
		
		double result = r * r * constants.PA_1;
		return result;
	}

}
