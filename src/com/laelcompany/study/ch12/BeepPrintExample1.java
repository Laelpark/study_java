package com.laelcompany.study.ch12;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		// 소리를 내는 객체 생성
		
		for(int i=0; i<5; i++) {		
			toolkit.beep(); // 소리내기
			try { Thread.sleep(500); } catch(Exception e) {}
	}						// 500ms 동안 멈췄다가 소리내기

		// 실행할 때 소리켜고 하기
		for(int i=0; i<5; i++) {
			System.out.println("☆☆");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
