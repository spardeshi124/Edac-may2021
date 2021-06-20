import java.util.Scanner;
class Assignment12
{
    public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter three nos: ");
		int i= sc.nextInt();
		int j= sc.nextInt();
		int k= sc.nextInt();
		int l= (i+j+k)/3;
		
		System.out.println("Average is: "+l);
	}
}