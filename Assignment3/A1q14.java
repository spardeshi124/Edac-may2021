import java.util.*;
class A1q14
{
    public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
		int y=sc.nextInt();
		
	    if((y%4==0 && y%100!=0)||(y%400==0))
		{
		    System.out.println(y+" is a Leap year");
		}
		else
		{
		    System.out.println(y+" is not a Leap year");
		}
	}
}