class InstanceExcept
{
	public static void main(String args[])
	{
		try
		{
			int x=10/5;
			int v[]=new int[5];
			v[5]=100;
		}
		catch(Exception e)
		{
			if(e instanceof ArithmeticException)
			{
				System.out.println(e);
			}
			if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println(e);
			}
		}
	}
}
		


		