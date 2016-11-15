public class ExceptionFlow{

	public static final void main(String[] args){
	
		try{
			
			System.out.println(7/0);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("After try catch clause here ");
	
	}

}