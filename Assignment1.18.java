class Assignment18
{
     public static void main(String args[])
	 {
	     String i = "010";
		 String j = "011";
		 
		 int k = Integer.parseInt(i,2);
		 int l = Integer.parseInt(j,2);
		 
		 int sum = k*l;
		 System.out.println(Integer.toBinaryString(sum));
	 }
	 
}