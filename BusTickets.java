package assignments;

public class BusTickets {

	public static void main(String[] args) {
		
		String Gender = "female";
		int    Age    = 27;

		if (Gender.equals("male")) {			                

              if(Age>=50){

               System.out.println("This Person is Eligible for senior citizen");
              } 

			  else if(Age>=10) {

			   System.out.println("This Person is Eligible for full ticket");
			  }
			  else if(Age>=5)  {

				System.out.println("This Person is Eligible for half ticket");
			  } 
			  else if(Age>=1) {

				System.out.println("This Person is Eligible for no ticket");
			  }
				else {
			    System.out.println("Person Eligible for free ticket");
			  }
		} else {

			System.out.print("Busticket is free for ladies");
		}
				
	}
}

	
	

