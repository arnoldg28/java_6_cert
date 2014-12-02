enum CoffeeSize{
	BIG(8),HUGE(10),OVERWHELMING(16);
	
	CoffeeSize(int ounces){
	this.ounces = ounces;
	}
	
	private int ounces;

	public int getOunces(){
	return ounces;
	}
}

class Coffee{
	CoffeeSize size;
	
	public static final void main(String[] args){
	Coffee drink1 = new Coffee();
	drink1.size = CoffeeSize.BIG;
	System.out.println(drink1.size.getOunces());

	for(CoffeeSize sz:CoffeeSize.values())
		System.out.println(sz+" "+sz.getOunces());
	
	}

}