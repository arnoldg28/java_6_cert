class NameRunnable implements Runnable{

	public void run(){	
		
		for(int x=0; x<3; x++){
		System.out.println("Run by" + Thread.currentThread().getName() + ", x is " + x);
		
		// Put Thread to sleep to force Threads to take turn
		try{ Thread.sleep(5*60*1000); }catch(InterruptedException ex){ ex.printStackTrace(); }
		
		}
		
	}

}

public class NamedThread{

	public static final void main(String[] args){
	
		// Make one runnable
		NameRunnable nr = new NameRunnable();
		
		// Create multiple threads
		Thread t1 = new Thread(nr);
		Thread t2 = new Thread(nr);
		Thread t3 = new Thread(nr);
		
		t1.setName("Fred");
		t2.setName("Lucy");
		t3.setName("Ricky");
		
		t1.start();
		t2.start();
		t3.start();
		
		//t1.start(); // IllegalThreadStateException - Once a thread has been started, it can never be started again.
	
	}

}