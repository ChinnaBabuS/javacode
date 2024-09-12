package assignments;

public class FinalVariable {
	
	static final double pi = 3.14; // Global Variable with final variable.
	final int r = 100;
	
	 
	static void Radius() {
		int a = 10;
		double area = pi*a*a;
		System.out.println(area);
		
	}
	
	void add() {
		int a = 200;
		int results = a+r;
		System.out.println(results);
	}
	
	public static void main(String[] args) {
		
		final int a= 10;                      // Local Variable with Final Variable.
		final String name = "chinna";
		
		System.out.println(a);
		System.out.println(name);
		Radius();
		FinalVariable g1= new FinalVariable();
		g1.add();
		
		
		
	}

}
