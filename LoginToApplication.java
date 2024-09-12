package assignments;

import java.util.Scanner;

public class LoginToApplication {
	
	public static void main(String[] args) {
		
		String firstname,lastname,email,gender,presentaddrs,permaddrs;
		
		int password;
		
		Scanner a1 = new Scanner(System.in);
		
    	System.out.println("Login to GroTechMinds");
		
		System.out.println("Enter first name ");
		firstname = a1.next();
		
		System.out.println("Enter last name ");
		lastname = a1.next();
		
		System.out.println("Enter email id ");
		email = a1.next();
		
	
		System.out.println("Enter password ");
		password = a1.nextInt();
		
		System.out.println("select the gender ");
		gender = a1.next();
		
		System.out.println("Enter present address ");
		presentaddrs = a1.next();

		System.out.println("Enter permanent address");
		permaddrs = a1.next();
		
		System.out.println("Welcome to GroTechMinds ");
		
		
	}

}
