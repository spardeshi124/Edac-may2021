import java.util.Scanner;
class Assignment5
{
    public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
		 System.out.print("Input First Number: ");
		 int i= sc.nextInt();
		 System.out.print("Input Second Number: ");
		 int j= sc.nextInt();
		 int k= i*j;
		 
		 System.out.println("Output: "+k);
	}
}