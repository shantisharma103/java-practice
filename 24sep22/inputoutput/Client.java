import java.net.*;
import java.io.*;
class Client
{
	public static void main(String args[])throws Exception
 	{
	//create a client socket with some port no
		Socket s=new Socket("localhost",777);
	
	//To Read data from server,attach input Stream to Socket
	
		InputStream obj= s.getInputStream();
	
		BufferedReader br=new BufferedReader(new InputStreamReader(obj));
	
	//Receive String
		String str;
		
		while((str=br.readLine())!=null){
			System.out.println("from server:"+str);
		}
		br.close();
		s.close();
	}
}

		 

	