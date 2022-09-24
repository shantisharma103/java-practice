class NestedTryExcept
{
public static void main(String args[])
{
	try
	{
		try
		{
		
			int i=10/0;
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);
		}
			int d[]=new int[10];
			d[100]=100;
	}
	catch(ArrayIndexOutOfBoundsException rt)
{
	System.out.println(rt);
	}
	
}
}