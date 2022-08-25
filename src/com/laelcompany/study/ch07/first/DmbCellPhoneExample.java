package com.laelcompany.study.ch07.first;

public class DmbCellPhoneExample {
	
	public static void main(String[] args) {

		// 부모
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		cellPhone.powerOff();
		cellPhone.bell();
		cellPhone.sendVoice("안녕하세요.");
		cellPhone.receiveVoice("네, 안녕하세요.");
		cellPhone.hangup();
		
		// 자식
		DmbCellPhone dmbcellphone = new DmbCellPhone("samsung","white",13);
		
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(11);
		dmbcellphone.turnOffDmb();

		// 자식 객체에 부모 메소드
		dmbcellphone.powerOn();
		dmbcellphone.powerOff();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("안녕하세요.");
		dmbcellphone.receiveVoice("네, 안녕하세요.");
		dmbcellphone.hangup();
		
		
	}
}