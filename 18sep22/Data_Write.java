import java.io.*;
public class Data_Write
{
	public static void main(String arg[])
	{
		try
		{
		FileOutputStream fin= new FileOutputStream("abc.txt");
			
		FileOutputStream data= new DataOutputStream(fin);

		data.writeInt(97);
				
		data.close();
		System.out.println("successful....");

		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
	
