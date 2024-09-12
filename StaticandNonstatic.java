package assignments;

public class StaticandNonstatic {
	
	static void Add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	static void Sub() {
		int a = 10;
		int b = 20;
		int sub = a-b;
		System.out.println(sub);
	}
	
	void Mul() {
		int a = 10;
		int b = 20;
		int mul = a*b;
		System.out.println(mul);
	}
	
	void Login() {
		 String name = "Chinna";
		 String password = "12345";
		 System.out.println("Logon to Google");
	}
	
	public static void main(String[] args) {
		
		StaticandNonstatic C1 = new StaticandNonstatic();
		
		Add();
		Sub();
		C1.Mul();
		C1.Login();
		
	}

}
