package assignments;

public class GlobalVariables {
	static double pi = 3.14;   // Global variable
	
	static void AreaOfCircle1() {
		int r = 10;
		    r= 40;
	
		double area = pi*r*r;
		System.out.println("Area of a circle1 is =  " + area);
	}
	static void AreaOfCircle2() {
		int r = 10;
		double area = pi*r*r;
		System.out.println("Area of a circle2 is =  " + area);
	}
	static void AreaOfCircle3() {
		int r = 20;
		double area = pi*r*r;
		System.out.println("Area of Circle3 is =  " + area);
	}
	static void AreaOfCircle4() {
		int r = 30;
		double area = pi*r*r;
		System.out.println("Area of Circle3 is =  " + area);
	}
	public static void main(String[] args) {
		AreaOfCircle1();
		AreaOfCircle2();
		AreaOfCircle3();
		AreaOfCircle4();
		
		
	}

}
