package thread;

public class ThreadPriority {

	public static void main(String[] args) {
		// Create three threads
		Thread t1=new Thread(new MyRunnable());
		Thread t2=new Thread(new MyRunnable());
		Thread t3=new Thread(new MyRunnable());
		
		// Set different priorities for each thread
		t1.setPriority(Thread.MIN_PRIORITY);// Lowest priority:1
		t2.setPriority(Thread.NORM_PRIORITY);// Normal priority (default):5
		t3.setPriority(Thread.MAX_PRIORITY);// Highest priority:10
		
		t1.start();
		t2.start();
		t3.start();

	}
	
	static class MyRunnable implements Runnable{
		public void run() {
			System.out.println(Thread.currentThread().getName()+" started with priority "+Thread.currentThread().getPriority());
			for(int i=1; i<5; i++) {
				System.out.println(Thread.currentThread().getName()+" is working");
				try {
					Thread.sleep(1000);	// Sleep for 1 second
				}
				catch(InterruptedException e) {
					System.out.println("Thread "+Thread.currentThread().getName()+" got interrupted.");
				}
			}
			System.out.println(Thread.currentThread().getName()+" completed...");
		}
	}
	

}
