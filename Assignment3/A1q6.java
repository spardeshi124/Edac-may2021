import java.util.*;
class A1q6
{
    public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
		double r = sc.nextInt();
		double area=0;
		double perimeter=0;
		area = 3.14*(r*r);
		System.out.println("Area of circle: "+area);
		
		perimeter= 2*3.14*r;
		System.out.println("Perimeter of circle: "+perimeter);
	}
}