package assignments;

public class Assign8ConstructorPara { // constructor
	
	Assign8ConstructorPara(int a, int b)
	{
		
	   int sum = a+b;
	   System.out.println(sum);
		
	}
	
	Assign8ConstructorPara(double a, int b)
	{
		
	   double sum = a+b;
	   System.out.println(sum);
		
	}
	Assign8ConstructorPara(String name, String Password){
		
		System.out.println("Login to Gmail Account");
	}
	
	
	public static void main(String[] args) {
		 
		new Assign8ConstructorPara(100,100);
		new Assign8ConstructorPara(5.2321,20);
		
		Assign8ConstructorPara g1=new Assign8ConstructorPara(10,10);
		Assign8ConstructorPara g2 = new Assign8ConstructorPara("Chinna","1234645");
	}

}
