package Day11;

public class Day11_5 {

	
	public static void main(String[] args) {
		
		Thread 강아지소리 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0 ; i < 5 ; i ++) {
					System.out.println("강아지소리");
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
			}
		});
		강아지소리.start();
		Thread 고양이소리 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0 ; i < 5 ; i ++) {
					System.out.println("고양이소리");
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
			}
		});
		고양이소리.start();
		Thread 호랑이소리 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0 ; i < 5 ; i ++) {
					System.out.println("호랑이소리");
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						
					}
				}
			}
		});
		호랑이소리.start();
		
	}
}
