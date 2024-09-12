package assignments;

public class ParameterizedMethos {
	
	static void Add(int a, int b) {
		  
		int sum = a+b;
		
		System.out.println(sum);
	}
	
	static void Login(String name, String password) {
		
		System.out.println("Login to Book My Show");
	}
	
	void Condition(int a, int b) {
		
		if(a==b)
		
		System.out.println("Condition1 is true");
	}
	
	void Condition1(int a, int b) {
		
		if(!(a==b))
			
			System.out.println("Condition2 is false");	
	}
	
	public static void main(String args[]) {
		
		Add(10,20);
		Login("chinna","1234");
		ParameterizedMethos n1 = new ParameterizedMethos();
		n1.Condition(10,10);
		n1.Condition1(10,20);
			
	}

}
