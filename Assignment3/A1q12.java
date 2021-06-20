import java.util.*;
class A1q12
{
    public static void main(String Args[])
	{
	    Scanner sc= new Scanner(System.in);
		double i= sc.nextInt();
		double gs=0;
		if(i<10000)
		{
		    gs=i+(0.9*i)+(0.1*i);
			System.out.println("Gross Salary: "+gs);
		}
		if(i>=10000)
		{
			gs=i+(0.98*i)+2000;
			System.out.println("Gross Salary: "+gs);
		}
	}
}