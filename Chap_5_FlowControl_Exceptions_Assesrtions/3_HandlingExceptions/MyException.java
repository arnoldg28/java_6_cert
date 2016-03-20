public class MyException{
	
	public final static void main(String[] args){
		
		MyException myE = new MyException();
		
		String food = null;
		
		if(args.length>0){
			food = args[0];
		}else{
			System.out.println("Food argument required!");
			return;
		}
		
		try{
			myE.checkFood(food);
		}catch(BadFoodException e){
			System.out.println("BAD FOOD!: " + food);
			e.printStackTrace();
		}
		
		
	}
	
	public void checkFood(String food) throws BadFoodException{
		
		String[] acceptedFoodList = {"Sinigang","Adobo","Kaldereta"};
		
		for(String f:acceptedFoodList){
			if(f.equals(food)){
				System.out.println("I like this food");
				return;
			}
		}
		
		throw new BadFoodException();
		
	}

}

class BadFoodException extends Exception{
}