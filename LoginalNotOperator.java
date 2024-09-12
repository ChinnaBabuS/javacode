package assignments;

public class LoginalNotOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(!(a==10 && b==30)) { // inside the bracket condition is false so NOT operator execute the program
			
			System.out.println("condition 1 is true");
		}
		
		if(!(a==10 && b==20)) { // inside condition is so its not executed
			
			System.out.println("Condition 2 is false");
		}
		
		if(!(a==30 || b==20)) {
			
			System.out.println("Condition3 is false");
		}
		
		if(!(a==11 || b==21)) {
			
			System.out.println("Condition4 is true");
		}

	}

}
