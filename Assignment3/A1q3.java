class A1q3
{
    public static void main(String args[])
	{
		int x = 1;
		int y ;
		String z ;

		
		y = (x*x) + 3*x - 7;
		System.out.println(y);
		y = x++ + ++x ;
	    System.out.println(x+" "+y);
		z = Integer.toString(x++ - --y - --x  +  x++);
		System.out.println(x+" "+y+" "+z);
		 

		z = Boolean.toString( (x==x) && (y==y) || !((x==x) || (y==y)));
		
		System.out.println(Boolean.parseBoolean(z));

		 
	}
}