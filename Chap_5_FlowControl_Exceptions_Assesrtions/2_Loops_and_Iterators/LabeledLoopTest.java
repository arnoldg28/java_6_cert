public class LabeledLoopTest{

	public static final void main(String[] args){
	
		// Labeled continue:
		foo:
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.println("Hello i="+i+"; j="+j); 
				continue foo;
			}
			System.out.println("Outer"); 
		}
		System.out.println("Bye"); 
	
		//Labeled Break:
		foo:
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.println("Hello i="+i+"; j="+j); 
				break foo;
			}
			System.out.println("Outer"); 
		}
		System.out.println("Bye"); 
	
		// Exercise
		System.out.println("Exercise"); 
		
		int age = 0;
		
		outer:
		while(age<=21){
			age++;
			if(age==16){
				System.out.println("Get your driver's license");
				continue outer;
			}else{
				System.out.println("Another year");			
			}
		}
	
	}

}