package com.laelcompany.study.ch08.first.InterfaceTest;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnon();
		remoteControl.furnoff();
		remoteControl.setmute(true);
		remoteControl.setmute(false);
		remoteControl.setvolume(100);
		RemoteControl.changeBattery();
		
		System.out.println("---------------------------------------");
		
		remoteControl.turnon();
		remoteControl.furnoff();
		remoteControl.setmute(true);
		remoteControl.setmute(false);
		remoteControl.setvolume(-10);
		RemoteControl.changeBattery();
		
		
	}

}
