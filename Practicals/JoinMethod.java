package thread;

public class JoinMethod {

	public static void main(String[] args) 
	{
		int num=4;
		Thread[] threads=new Thread[num];
		
		for(int i=0; i < num; i++) {
			threads[i]=new Thread(new MyRunnable());
			threads[i].start();
		}
		for(int i=0; i < num; i++) {
			try {
				//wait for all threads to finish
				threads[i].join();
			}
			catch(InterruptedException e) {
				System.out.println("Interruption in thread");
			}
		}
		System.out.println("All threads have completed execution.");
	}
	
	static class MyRunnable implements Runnable{
		public void run() {
			System.out.println("Thread "+Thread.currentThread().getId()+" started");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread "+Thread.currentThread().getId()+" completed..");
		}
	}


}
