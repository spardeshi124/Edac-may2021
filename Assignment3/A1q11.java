import java.util.*;
class A1q11
{
    public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
		int i= sc.nextInt();
		int j= sc.nextInt();
		
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("After swapping i:"+i+" j:"+j);
	}
}