class Sol102Hcf// gcd also called hcf&gcf
{
	public static void main(String args[])
	{

		int a1=50,a2=60;
		while(a1!= a2)
		{
			if(a1>a2)
			{
				a1=a1-a2;
			}
			else
			
				a2=a2-a1;
		}	
		
			System.out.println("gcd of a1 and a2 is "+a2);
		
	}
}