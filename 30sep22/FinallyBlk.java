class FinallyBlk
{
	public static void main(String args[])
	{
		try
		{
			int i=10/5;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("lastly block exc:");
			
		}
	}
}
		

