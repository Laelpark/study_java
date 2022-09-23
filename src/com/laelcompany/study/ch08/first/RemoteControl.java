/*package com.laelcompany.study.ch08.first;

public interface RemoteControl {
	
	// 인터페이스 

	public static final int MAX_VOLUME = 10, MIN_VOLUME = 0;
			// 인트형 상수 
	
	// 추상메소드 = 일반 클래스
	public abstract void turnOn();	
	void turnOff();
	void setVolume(int volume);
	
	
	//default: 디폴트메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//static: 정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
*/

package com.laelcompany.study.ch08.first;
	public interface RemoteControl {
		
		public static final int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		
		public abstract void turnOn();
		void trunOff();
		void setVolume(int volum);
		
		default void setMute(Boolean mute) {
			if(mute) {
				System.out.println("무음처리");
			} else {
				System.out.println("무음해제");
			}
		} 
		
		static void changeBattery() {
			System.out.println("배터리교체");
		}
		
	}