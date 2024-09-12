package assignments;

public class Assign8NonStaticPara {  // constructor method
	
	void Add(double a, float b) {    // non static with parameters
		
		double results = a-b;
		
		System.out.println(results);
		
	}
	void Login(String email,  String password, double mobileno) {
		
		System.out.println("Registration to Facebook");
	
	}
    void Add(float a, float b) {
		
		double results = a-b;
		
		System.out.println(results);
    }
	public static void main(String[] args) {
		
		Assign8NonStaticPara n1=new Assign8NonStaticPara();
		n1.Add(10.233, 5.2333534f);
		n1.Login("Chinnababu@gamil.com", "Priya1234", 6303839398l);
		n1.Add(20.1324243f, 10.2434354232f);
		
		
		
	}

}
