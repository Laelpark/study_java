package com.laelcompany.study.ch07.first;

 public class DmbCellPhone extends CellPhone {
 // 자식 클래스
	 
	 
	 // 필드
	 int channel;
	 
	 // 생성자
	 DmbCellPhone(String model, String color, int channel) {
		this. model = model;
		this. color = color;
		this. channel = channel;		
	 }
	 
	DmbCellPhone() {
		
	}

	
	//메소드
	void turnOnDmb() {
		powerOn();
		System.out.println("채널 " + channel + "을 수신합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(channel);
	}
	void turnOffDmb() {
		System.out.println("종료");
	}
	 
 }
