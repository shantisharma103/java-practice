import java.net.*;
import java.io.*;
class Client2
{
	public static void main(String args[])throws Exception
 	{
	//create a client socket with some port no
		Socket s=new Socket("localhost",8888);
	
	//To Read data from server,attach input Stream to Socket
	
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));

	//Receive String
		String str,str1;
		
		while(! (str=kb.readLine()).equals("exit"))
		{
			dos.writeBytes(str+"\n");
			str1=br.readLine();
			System.out.println(str1);
		}
		dos.close();
		br.close();
		kb.close();
		s.close();
	}
}

		 

	