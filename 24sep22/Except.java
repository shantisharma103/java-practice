class Except
{
public static void main(String args[])
{
	try
	{
		int i=10/0;
	
	} catch(ArithmeticException e) {
			System.out.println(e);
	}
	
}
}