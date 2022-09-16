import java.io.*;
class DataWrite
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fin= new FileOutputStream ("abc.txt");
			
			DataOutputStream data= new DataOutputStream ("fin");

				data.writeInt(97);
				
				data.close();
			System.out.println("successful....");

		}
		catch(Exception r)
		{
			System.out.println(r);
		}
	}
}
	
