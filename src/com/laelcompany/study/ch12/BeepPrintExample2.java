package com.laelcompany.study.ch12;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		//how1
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//how2  BeepTask클라스를 사용하지 않고 현 클라스에 직접 구현한 것(사용하기 가장 편함)
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();	
//				for(int i=0; i<5; i++) {		
//					toolkit.beep();
//					try { Thread.sleep(500); } catch(Exception e) {}
//				}
//			}
//		});
		
		//how3
//		Thread thread = new Thread(() -> {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();	
//			for(int i=0; i<5; i++) {		
//				toolkit.beep();
//				try { Thread.sleep(500); } catch(Exception e) {}
//			}
//		});
		
		// thread 실행
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("☆☆");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}