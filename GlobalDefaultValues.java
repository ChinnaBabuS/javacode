package assignments;

public class GlobalDefaultValues {
	 
	static boolean a;
	static char b;
	static byte c;
	static short d;
	static int e;
	static long f;
	static float g;
	static double h;
	int k = 100;
	
	static void Default() {
		int x;
		x= 10;
		double b;
		b=1.233;
		
		System.out.println("static method with default");
		System.out.println(x+b);
	}
	void Default1() {
		
		boolean s;
		s= true;
		float t;
		t= 1.2343546f;
		System.out.println("non static method with default");
		System.out.println(s);
		System.out.println(t);
		
	}
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

		System.out.println("Default values in java");
		GlobalDefaultValues g1 = new GlobalDefaultValues();
		System.out.println(g1.k);
		Default();	
		g1.Default1();
	
		
		
	}

}
