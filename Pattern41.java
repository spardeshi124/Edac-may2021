class Pattern41
{
    public static void main(String args[])
	{
	    for(int i=9;i>=1 ;i--)
		{
		    for(int j=9; j>=i; j--)
			{
			    System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{ 
			    System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}