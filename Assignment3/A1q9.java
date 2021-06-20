import java.util.*;
class A1q9
{
    public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int y=0;
		int m=0;
		int d=0;
		if(n > 365)
		{
			y=n/365;
		    m=(n%365)/30;
			d=(n%365)%30;
			System.out.println("Year: "+y+", Month: "+m+", Days: "+d);
		}
		
	    else if(n < 365)
		{
			m=n/30;
			d=n%30;
			System.out.println("Year: "+y+", Month: "+m+", Days: "+d);
		}
		else
			System.out.println("Year: "+y+", Month: "+m+", Days: "+d);
		
		
	}
	
}