import java.io.*;
class CreateFile

{
	public static void main(String args[])
	{
		File f=new File("D:\\16sepException\\LC.txt");
		System.out.println("main method started");

		try
		{
			if(f.createNewFile())
			{
			System.out.println("file create successfully....");
			}
			else
			{
			System.out.println("file allready exist....");
			}
		}

		catch(Exception e)
		{
		System.out.println("exception handale..");
		}
	
		
	}
}

