class VarArgsTest{

 public static void main(String[] args){
  System.out.println(avg(10,20,30));	
 }

 public static double avg(double... numbers){
	double total = 0;
	for(double d:numbers){
	   total += d;
	}
	return total/numbers.length;
 }	

}