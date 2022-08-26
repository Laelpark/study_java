package com.laelcompany.study.ch07.forth;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
			// 상수  // 
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();
			// 자식의 fly와 부모의 fly 중 부모의 fly를 가져다 쓰고 싶을 때 코드 (그냥 외워서 사용)
			// 그렇지 않으면 기본적으로 자식의 fly를 가져다 사용
			// 기본적으로는 한번 Override 했으면 실행 클래스에서 부모의 fly를 바로 가져다 쓸 수 없음
		}
	}

}