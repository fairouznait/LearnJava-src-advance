package advance;

import java.util.Scanner;

public class LearnScanner {    
	
	
	 public static void main(String[] args) {   
		 
		 
		 Scanner input =new Scanner(System.in);
		 System.out.println("enter your first name");
		 String firstname=input.nextLine();
		 System.out.println("firstname  "+firstname);
		 System.out.println("enter your last name");
		String lastname= input.nextLine();
		System.out.println("lastname : "+lastname);
		
		System.out.println("fullname = "+firstname+"  "+lastname);
		
		System.out.println("enter your coursee fees");
		 int courseefee=input.nextInt();
		 System.out.println("courseefee  "+courseefee );
		
	}

}
