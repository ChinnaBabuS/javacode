package assignments;

public class MultipleIfBlock {
	
	
	public static void main(String[] args) {
		
		int age = 60;
		
		if(age>=50) {
			System.out.println("Person eligible for senior citizen");
		}
		else {
			if(age>=10) {
				System.out.println("Person eligible for full ticket");
			}

		else {
			if(age>=5) {
				System.out.println("Person eligible for half ticket");
			}
			
		else {
			if(age>=1) {
				System.out.println("Person eligible for no ticket");
				}	
			
			else {
				System.out.println("A person eligible free ticket");
			}
		}
	
	
		}	
	}
	}
}


		  