import java.io.*;
class File_write
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout= new FileOutputStream("abc.txt");
			String s="welcome to my java batch";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	
