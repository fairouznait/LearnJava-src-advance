package advance;

public class LearnNestClass {
	int num =20;
	int num1=30;
	
	public static void main (String [] args) { 
		
		
		LearnNestClass learn=new LearnNestClass();
		System.out.println(learn.num); 
		
		
		
		computer com=new computer();
		System.out.println(com.computerName); 
		System.out.println(com.computerPrice);
		
		computer.computerDisplay();
		
		
		//computer.mobile.mobile=new mobile();
		
	}
	
	
	
	public static class computer{
		public static Object mobile;
		String computerName="HP";
		static String computerPrice="2000";
		
		
		
		public static void computerDisplay() {
			
			System.out.println("computerDisplay");
			
			
		}
		
	}
	
	
	 
	public class mobile{
		
		static String mobileBrand="Iphone";
		int mobileprice=1200;
		
		
		
	}

}
