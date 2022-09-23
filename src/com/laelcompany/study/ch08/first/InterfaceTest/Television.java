package com.laelcompany.study.ch08.first.InterfaceTest;

public class Television implements RemoteControl{

	private int volume;

	@Override
	public void turnon() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void furnoff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setvolume(int volume) {
		if(volume > RemoteControl.max_volume) {
			this.volume = RemoteControl.max_volume;
		} else if(volume < RemoteControl.min_volume) {
			this.volume = RemoteControl.min_volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	
	
	
}
