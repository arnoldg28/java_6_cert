public class SyncBlockOfCode extends Thread{

	StringBuffer letter;
	
	public SyncBlockOfCode(StringBuffer letter){
		this.letter = letter;
	}

	public void run(){
	
		synchronized(letter){		
			for(int i = 1;i<=100;++i){
				System.out.print(letter);
			}
			char temp = letter.charAt(0);
			++temp;
			letter.setCharAt(0,temp);
		}
	
	}
	
	 final static public void main(String [] args){
		StringBuffer sb = new StringBuffer("A");
		new SyncBlockOfCode(sb).start();
		new SyncBlockOfCode(sb).start();
		new SyncBlockOfCode(sb).start();
	}

}