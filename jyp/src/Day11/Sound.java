package Day11;

import java.awt.Toolkit;

public class Sound extends Thread{
				// extends : ��� �ޱ�
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// ����� �޼ҵ� ���� �������ִ� Ŭ����
	
	for(int i = 0 ; i<5 ; i++) {
		toolkit.beep(); // �����
			// �Ҹ��� 1�� ����Ǳ� ���� for���� ���� 5�� ȸ��
		
		// ������ 1�ʰ� �Ͻ�����
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		} 
		
	}
	}
}
