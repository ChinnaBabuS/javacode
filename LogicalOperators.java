package assignments;

public class LogicalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		if(a==20&& b==10) { // here two conditions are false
			
			System.out.println("the block is false");
			
		}
		if(a==10 && b==20) { // here two conditions are true
			
			System.out.println("the block is true");
			
		}
	}        // In AND operator it can execute only if two conditions are true 

}
