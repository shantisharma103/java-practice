class FileWrite

{
	public static void main(String args[])
	{

	try
	{
		File f=new File("D:\\16sepException\\LC.txt");
		try
		{

			f.write("java is best programming language");
		}
		finally
		{
			f.close();
		}
		System.out.println("successfully data wrote in file");
	}

		catch(Exception i)
		{
			System.out.println(i);
		}
	
	
	}
}


		