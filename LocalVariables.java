package assignments;

public class LocalVariables {
	
	static void add() {
		int a = 10;
		int b = 20;
		if(a>20 && b<30) {
			System.out.println("A is greater");
		}
		else {
			System.out.println("B is Lessar");
		}
	}
	
	void login(String name, long password) {
		System.out.println("Login to browser");
	}
	
	void method() {
		boolean answer = false;
		System.out.println("Statement is false");
	}
	
	public static void main(String[] args) {
		add();
		LocalVariables a1 = new LocalVariables();
		LocalVariables a2 = new LocalVariables();
		a1.login("babu",12132334l);
		 a2.method();
		
		
		
	}

}
