package com.laelcompany.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		// 명시적 생성자를 사용하여 객체를 생성하고 모들 필드(변수)를 출력하시오
		
		Student student = new Student("Tony", "123-456", 1);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		
		Student student2 = new Student("lael", "789-654");

		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
		 
		Student student3 = new Student("sdf", "84563-654165");

		System.out.println(student3.name);
		System.out.println(student3.ssn);
		System.out.println(student3.studentNo);
	}

	
	
}
