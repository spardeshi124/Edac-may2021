import java.util.*;
class A1q13
{
    public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		
		if(i>j&&i>k)
		{
		    System.out.println("Greater no is: "+i);
		}
		else if(j>i&&j>k)
		{
		    System.out.println("Greater no is: "+j);
		}
		else
		{
		    System.out.println("Greater no is: "+k);
		}
		
		
		System.out.println("Using ternary");
		
		int largest=0;
		largest= k>(i>j?i:j)?k:(i>j?i:j);
		System.out.println("Greater no is: "+largest);
		
		
	}
}