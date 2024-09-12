package assignments;

public class LogicalOrOpearator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a==20 || b==20) {
			
			System.out.println("Statemts1 is true");
		}
		
		if(a==10 || b==20) {
			
			System.out.println("Statement2 is also true");
		}
		
		if(a==21 || b==10) {
			
			System.out.println("Statement3 is false");
		}

	}

}
