class Except1
{
public static void main(String args[])
{
	try
	{
	int x=10/5;
	int y[]=new int[5];
		y[10]=100;
	}
	catch(ArithmeticException e)
	{
	System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundException ar)
	{
	System.out.println(ar);
	}
}
}