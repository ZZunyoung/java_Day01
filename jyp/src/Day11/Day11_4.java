package Day11;

import java.awt.Toolkit;

public class Day11_4 {

	// ������ : ���μ����� �ڵ带 �о� �ִ� ����
		// ���μ��� : [ code, data, stack, heep ] �������� ���α׷�
			// ���α׷� : ��ɾ�[�ڵ�]���� ����
	
	// ��Ƽ������ : ����ó��
		// ��ǻ�� ����ó�� : ��Ƽ�������� ��� ���������� �����ư��鼭 ó��
			// �����ٸ� : ��Ƽ�������� ��� �������� ó�������� cpu �� ����
				// java ������ �����ٸ� ��Ʈ�� x
	
	// ��� vs �������̽� ����
		// ��� : Ŭ������ �θ�Ŭ�����κ��� ��ӹ޾� �ڽ�Ŭ�������� ���踦 ����
			// �θ�Ŭ������ �޸𸮸� �̾��
			// ���� : ��Ը� ����, ���� ����
			// extends �ڿ� �ϳ��� Ŭ������ ����
	
		// �������̽� : �߻�� �޼ҵ带 �ش� Ŭ�������� �����Ͽ� ����ϱ�
			// ���� : ������ �������� ������ ��ɼ���
			// implements �ڿ� �������� �������̽� ����
	
	
	// 1. main �޼ҵ� : main �޼ҵ忡 main������ ����
	// 2. Thread Ŭ����
			// run �޼ҵ忡 �����ڵ� ����
			// start �޼ҵ� : run �޼ҵ� ȣ��
	
	public static void main(String[] args) {
		
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
		for (int i = 0 ; i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
		
		// ��2) ��Ƽ������
		System.out.println("---- ��Ƽ������ Ŭ���� ����");
		Thread thread1 = new Sound();
		thread1.start(); // �����峻 run �޼ҵ� ȣ�� -> ������ ���� ����
		
		// ��� 2
		for (int i = 0 ; i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
		
		// ��3) ��Ƽ ������ �������̽�
		System.out.println("---- ��Ƽ������ �������̽� ����");
		Runnable runnable = new Sound2(); // ������ �������̽��� Ŭ���� ����
		Thread thread2 = new Thread(runnable);
		
		thread2.start();
		for (int i = 0 ; i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
		
		// ��4) �ұԸ� ������ �������̽�
		
		Thread thread3 = new Thread(new Runnable() {
			
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
		});
		
		thread3.start();
		for (int i = 0 ; i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
		
		
		
		
		
		
		
		
	}
}
