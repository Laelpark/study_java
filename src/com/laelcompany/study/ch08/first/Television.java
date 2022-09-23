//package com.laelcompany.study.ch08.first;
//
//public class Television  implements RemoteControl{
//	
//	// 인터페이스를 받아오는 일반 클래스
//	
//	private int volume;
//	
//	@Override
//	public void turnOn() {
//		System.out.println("TV를 켭니다.");
//	}	
//	
//	@Override
//	public void turnOff() {
//		System.out.println("TV를 끕니다.");
//	}
//	
//	@Override
//	public void setVolume(int volume){
//		if(volume>RemoteControl.MAX_VOLUME) {
//			this.volume = RemoteControl.MAX_VOLUME;
//		} else if(volume<RemoteControl.MIN_VOLUME) {
//			this.volume = RemoteControl.MIN_VOLUME;
//		} else {
//			this.volume = volume;
//		}
//		System.out.println("현재 TV 볼륨: " + this.volume);
//	}
//	
//}

package com.laelcompany.study.ch08.first;
	public class Television implements RemoteControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("tv켬");
		
	}

	@Override
	public void trunOff() {
		System.out.println("tv끔");
		
	}

	@Override
	public void setVolume(int volum) {
		if(volum > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volum < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volum;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	} 
	
}
