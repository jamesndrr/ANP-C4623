package thread;

public class ThreadTest{
	public static void main(String[]args) {
		Thread t1= new Thread(new EvenThread());
		Thread t2= new Thread(new OddThread());
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread finished..");
	}
}
class EvenThread implements Runnable{
	@Override
	public void run() {
		for(int i=2; i<=10; i+=2) {
			System.out.println("Even Thread: "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class OddThread implements Runnable{
	@Override
	public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
