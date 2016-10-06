public class NotifyAllSample{

	final static public void main(String[] args){
		Calculator calc = new Calculator();
		
		//calc.start(); // This will execute notify all without any thread waiting for the lock
		
		new Reader(calc).start();
		new Reader(calc).start();
		new Reader(calc).start();
		
		// This sleep block will try to keep the calc from running before all thread are in waiting state
		//try{
			//Thread.sleep(1000);
		//}catch(InterruptedException e){}
		// All thread that are waiting needs to start first. Becuase if notify all get called before wait. The waiting thread will wait indefinitely
		calc.start();
	
	}

}

class Calculator extends Thread{

	int total;
	
	public void run(){
		synchronized(this){
			for(int i=0; i<100; i++){
				total += i;
			}
			notifyAll();
		}
	}
}


class Reader extends Thread{
	
	Calculator c;

	public Reader(Calculator calc){
		c = calc;
	}
	
	public void run(){	
		synchronized(c){
			try{
				System.out.println(Thread.currentThread().getName() + " Waiting for calculation...");
				c.wait();
			}catch(InterruptedException e){}
		}
		System.out.println(Thread.currentThread().getName() + " Total is: " + c.total);
	}

}