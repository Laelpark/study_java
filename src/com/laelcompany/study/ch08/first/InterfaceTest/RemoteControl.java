package com.laelcompany.study.ch08.first.InterfaceTest;

public interface RemoteControl {

	public static final int max_volume = 10;
	int min_volume = 0;
	
	public abstract 
		void turnon();
		void furnoff();
		void setvolume(int volume);
		
	default void  setmute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교체를 교환합니다.");
	}
}
