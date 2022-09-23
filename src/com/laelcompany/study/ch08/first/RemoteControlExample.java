//package com.laelcompany.study.ch08.first;
//
//public class RemoteControlExample {
//	
//	public static void main(String[] args) {
//		
//		
//// 맞은 방법		RemoteControl television = new Television();      왼쪽에는 인터페이스 이름, 오른쪽에 클래스 이름이 나와야됨
//// 맞은 방법		RemoteControl remoteControl = new Television();
//// 틀린 방법		Television television2 = new Television();
//	
//		
//	RemoteControl remoteControl = new Television();
//	remoteControl.turnOn();
//	remoteControl.turnOff();
//	remoteControl.setMute(true);
//	remoteControl.setMute(false);
//	remoteControl.setVolume(-10);
//	RemoteControl.changeBattery();
	
//	Audio audio = new Audio();
//	Television television = new Television();
//	
////	audio.turnOn();
////	audio.turnOff();
//	television.turnOn();
//	television.setMute(true);
//	television.setMute(false);
//	television.setVolume(-10);
//	RemoteControl.changeBattery();
//	television.turnOff();
//	
//	System.out.println();
////	인터페이스를 구현한 클래스는 위에 처럼 일반클래스 객체 만들듯이 하면 않된다.
//	
////	인터페이스를 구현한 클래스를 사용해야 된다. 할때는
////	RemoteControl remoteControl;	// 인터페이스 변수 선언
////	remoteControl = new Audio();	// 구현객체로  초기화
//	
//	RemoteControl remoteControl = new Audio();
////	RemoteControl remoteControl = new Television();
//	
//	remoteControl.turnOn();
//	remoteControl.turnOff();
//	remoteControl.setMute(false);

package com.laelcompany.study.ch08.first;
 public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new Television();
		
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(-10);
		remoteControl.trunOff();
		remoteControl.turnOn();
		RemoteControl.changeBattery();
		
	} 
	
	 
 }

