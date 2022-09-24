class MultiExcept
{
public static void main(String args[])
{
	try
	{
	int i=10/0;
	int y[]=new int[5];
		y[10]=100;
	}
	catch(ArithmeticException|ArrayIndexOutOfBoundException e)
	{
	System.out.println(e);
	}
	
}
}