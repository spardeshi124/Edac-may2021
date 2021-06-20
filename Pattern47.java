class Pattern47
{
    public static void main(String args[])
	{
	    for(int i=1; i<=6; i++)
		{
		    for(int j=5; j>=i; j--)
			{
			    System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++)
			{
				if(k==1||i==6||k==(2*i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}