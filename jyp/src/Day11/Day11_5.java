package Day11;

public class Day11_5 {

	
	public static void main(String[] args) {
		
		Thread �������Ҹ� = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0 ; i < 5 ; i ++) {
					System.out.println("�������Ҹ�");
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
			}
		});
		�������Ҹ�.start();
		Thread ����̼Ҹ� = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0 ; i < 5 ; i ++) {
					System.out.println("����̼Ҹ�");
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
			}
		});
		����̼Ҹ�.start();
		Thread ȣ���̼Ҹ� = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0 ; i < 5 ; i ++) {
					System.out.println("ȣ���̼Ҹ�");
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
			}
		});
		ȣ���̼Ҹ�.start();
		
	}
}
