import java.util.*;
class A1q15
{
    public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter gender: male/female");
		String gender = sc.next();
		//String gender1= "male";
		//String gender2= "female";
		String s1="male";
		String s2="female";
		System.out.println("Enter age: ");
		int age= sc.nextInt();
		
		
		if(gender.equals(s1))
		{	
	        if(age>=21)
		    System.out.println("Male is eligible for marriage");
		    else
			System.out.println("Male is not eligible for marriage");	
		}
		else if(gender.equals(s2))
		{
				if(age>=18)
				    System.out.println("Female is eligible for marriage");	
				else
					System.out.println("Female is not eligible for marriage");
		}
		else
		{
			System.out.println("Invalid input");
		}
		    
		
	}
}