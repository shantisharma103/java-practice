import java.io.*;
class InputOutput
{
	public static void main (String args[])
	{
		try
		{
		FileOutputStream fout=new FileOutputStream("abc.txt");
	
		PrintStream ps =new PrintStream(fout);
		
		ps.println(10);
		ps.println("Hello");
		ps.println("Hello my java batch");
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
	
	
	