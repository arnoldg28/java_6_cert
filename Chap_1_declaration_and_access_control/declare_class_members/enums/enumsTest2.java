enum CoffeeSize{
	BIG(8),HUGE(10),

	OVERWHELMING(16){
		public String getLidCode(){ //Overriding Method
		return "A";
		}
	};// Semicolon is required when more code follows.
	
	CoffeeSize(int ounces){
	this.ounces = ounces;
	}
	
	private int ounces;

	public int getOunces(){
	return ounces;
	}
	
	public String getLidCode(){ //Overriden methods
	return "B";
	}
	
}

class Coffee{
	CoffeeSize size;
	
	public static final void main(String[] args){
	for(CoffeeSize sz:CoffeeSize.values())
		System.out.println(sz+" "+sz.getOunces()+" "+sz.getLidCode());
	
	}

}