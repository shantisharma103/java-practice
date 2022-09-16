import java.io.*;
class ThrowsException

{
	public static void main(String args[])throws IOException
	{
		File f=new File("D:\\16sepException\\LC.txt");

		
			if(f.createNewFile())
			{
			System.out.println("file create successfully....");
			}
			else
			{
			System.out.println("file allready exist....");
			}
	}
	
		
}
