package Day11;

import java.awt.Toolkit;

public class Sound extends Thread{
				// extends : 상속 받기
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 경고음 메소드 관련 제공해주는 클래스
	
	for(int i = 0 ; i<5 ; i++) {
		toolkit.beep(); // 경고음
			// 소리가 1번 실행되기 전에 for문이 먼저 5번 회전
		
		// 스레드 1초간 일시정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		} 
		
	}
	}
}
