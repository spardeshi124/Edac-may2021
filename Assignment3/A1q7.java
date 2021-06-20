import java.util.*;
class A1q7
{
    public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[]= new int[n];
		 
		for(int i=0; i<a.length; i++)
        {
		    System.out.print("Enter marks: ");
		    a[i]= sc.nextInt();
		}		
		int sum=0;
		for(int j=0; j<a.length; j++)
		{
		    sum=sum+a[j];
		}
		System.out.println("Sum of marks: "+sum);
		float percentage;
	    percentage= (float) sum/n;
		System.out.println("Percentage: "+percentage+"%");
	}
}