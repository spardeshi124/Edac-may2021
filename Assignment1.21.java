import java.util.Scanner;
class Assignment21
{
    public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int i = sc.nextInt();
		
		System.out.println(Integer.toOctalString(i));
	}
}