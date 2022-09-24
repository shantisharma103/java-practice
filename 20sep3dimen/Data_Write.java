import java.io.*;
 class Data_Write
{
	public static void main(String arg[])
	{
		try
		{
		FileOutputStream fin= new FileOutputStream("abc.txt");
			
		DataOutputStream data= new DataOutputStream(fin);

		data.writeInt(97);
				
		data.close();
		System.out.println("successful....");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	
