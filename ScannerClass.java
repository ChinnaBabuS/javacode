package assignments;

import java.util.Scanner;

public class ScannerClass {

	
	public static void main(String[] args)
	{
	// Program for finding the area of a Circle
		final double pi;
		int r;
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter the value of pi ");
		pi = a1.nextDouble();
		System.out.println("Enter the value of radius r ");
		r = a1.nextInt();
		System.out.println("Area of a circle is = "+ pi*r*r);
		
	}
	// Program for finding the area of  Rectangle 
	{
	    int l,b;
	    Scanner a1 = new Scanner(System.in);
	    System.out.println("Enter the value of length of the Rectangle ");
	    l = a1.nextInt();
	    System.out.println("Enter the value of breadth of the Rectangle ");
	    b = a1.nextInt();
	     int area = l*b;
	     System.out.println("Area of a Rectangle is = "+ area);  

	}
	// Program for finding the area of  Square 
		{
		    int a;
		    Scanner a1 = new Scanner(System.in);
		    System.out.println("Enter the value of length of the Rectangle ");
		    a = a1.nextInt();
		   
		     int area = a*a;
		     System.out.println("Area of a Rectangle is = "+ area);  

		}
	 // Program for finding the area of Triangle
		{
		final Double c = 0.5;
		Double h,b;
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter the value of base");
		b = a1.nextDouble();
		System.out.println("Enter the value of height");
		h = a1.nextDouble();
		double area = c*(b*h);
		System.out.println("Area of a Triangle = " + area);
		
		}
	 // Program for finding the area of Triangle
	{
	final Double d = 0.5;
	Double l1,l2,h;

	Scanner a1 = new Scanner(System.in);
	System.out.println("Enter the value of base 1");
	l1 = a1.nextDouble();
	System.out.println("Enter the value of base 2");
	l2 = a1.nextDouble();
	System.out.println("Enter the value of height");
	h = a1.nextDouble();
	
	double area = d*(l1*l2)*h;
	System.out.println("Area of a Trepizium = " + area);
	
	}
	
}





