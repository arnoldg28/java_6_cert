public class Racer implements Runnable{
	private String winner;

	public void race(){
		for(int distance=1;distance<=100;distance++){
			System.out.println("Distance Covered by "+Thread.currentThread().getName()+" is: "+distance+" meters");
			boolean isRaceWon = this.isRaceWon(distance);
		}
	}

	private boolean isRaceWon(int totalDistanceCovered){
		boolean isRaceWon = false;
		if((this.winner==null)&&(totalDistanceCovered==100)){
			String winnerName = Thread.currentThread().getName();
			this.winner = winnerName;
			System.out.println("Winner is:" + this.winner);
			isRaceWon = true;
		}else if(this.winner==null){
			isRaceWon = false;
		}else if(this.winner!=null){
			isRaceWon = true;
		}
		return isRaceWon;
	}

	public void run(){
		this.race();
	}

	//Think of this as other class running the threads.
	public static void main(String[] args){
		Racer racer = new Racer();
		Thread tortoiseThread = new Thread(racer,"Tortoise");
		Thread hareThread = new Thread(racer,"Hare");
		tortoiseThread.start();
		hareThread.start();
	}
}
