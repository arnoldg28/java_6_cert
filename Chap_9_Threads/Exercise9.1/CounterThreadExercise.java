public class CounterThreadExercise{

	public static final void main(String[] args){
	
		Counter ctrRunnable = new Counter();
		
		Thread counterThread = new Thread(ctrRunnable);
	
		counterThread.start();
	
	}

}

class Counter implements Runnable{

	public void run(){

		for(int x=1; x<=100; x++){
			if(x%10 == 0){
				System.out.println("x is now divisible by 10: " + x);
			}
			
			try{ Thread.sleep(1000); }catch(InterruptedException ex){ ex.printStackTrace(); }
		}
	
	}

}