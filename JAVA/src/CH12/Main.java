package TestThread;

public class Main {

	public static void main(String[] args) {
		Runnable dong = new DongTask(); 
		Thread thread = new Thread(dong);
		thread.start(); 
		
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Dong");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
				}	
			}
		}); 
		thread1.start();
		
		
		Thread thread2 = new DongThread();
		thread2.start(); 
		
		Thread thread3 = new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("DongDong");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		};
		thread3.start(); 
		
		
		for(int i =0; i<10; i++) {
			System.out.println("DDing");
			try { 
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		

		
		
	}

}