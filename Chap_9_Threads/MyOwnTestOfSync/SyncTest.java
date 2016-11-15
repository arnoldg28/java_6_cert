public class SyncTest{

	public static void main(String[] args){
	
		MySyncClass msc = new MySyncClass();
		
		MyRunnable1 r1 = new MyRunnable1(msc);
		MyRunnable2 r2 = new MyRunnable2(msc);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}

class MyRunnable1 implements Runnable{
	
	MySyncClass msc;
	
	public MyRunnable1(MySyncClass msc){
		this.msc = msc;
	}
	
	public void run(){
			msc.method1();
	}

}

class MyRunnable2 implements Runnable{

	MySyncClass msc;
	
	public MyRunnable2(MySyncClass msc){
		this.msc = msc;
	}
	
	public void run(){
		msc.method2();
	}

}


class MySyncClass{
	public synchronized void method1(){
		for(int x=0; x<5 ; x++){
			System.out.println(Thread.currentThread().getName() + " MySyncClass Method 1");
			try{
				Thread.sleep(500);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
		}
	}
	
	public synchronized void method2(){
		for(int x=0; x<5 ; x++){
			System.out.println(Thread.currentThread().getName() + " MySyncClass Method 2");
			try{
				Thread.sleep(500);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
		}
	}
}