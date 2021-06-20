import java.util.Scanner;
class Assignment3
{
     public static void main(String args[])
	 {
		  Scanner sc  = new Scanner(System.in);
		  System.out.println("Enter two nos: ");
		  int i = sc.nextInt();
		  int j = sc.nextInt();
		  int k = i/j;
		  
		  System.out.println("Division: "+k);
		  
	 }
}