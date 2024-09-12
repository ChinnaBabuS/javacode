package assignments;

public class Assignment8StaticPara {
	
	static void Add(int a, int b) {
		
		int sum = a+b;
		System.out.println(sum);
		
	}
    static void Login(String name, long mobileno) {
		
        System.out.println("Login to Google");
		
	}
    static void Sub(int a, double b) {
		
    	double result = a-b;
        System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		
		  Add(10,20);
		  Login("Chinna",1234567);
		  Sub(10,5.321);
		  
	}

}
