import java.net.*;
import java.io.*;
class Server
{
	public static void main(String args[])throws Exception
 	{
	//create a server socket with some port no
		ServerSocket ss=new ServerSocket(777);
	
	//Let server wait till a client accepts connection
		Socket s=ss.accept();
		System.out.println("connection establish");
	
	//attech the output stream to the server socket
		OutputStream obj=s.getOutputStream();
	
	//attech print stream to send data to server socket
		PrintStream ps= new PrintStream(obj);
		String str="Hello client";
		
		ps.println(str);
		ps.println("now server send data to cient");
		ps.println("Bye");
	
		ps.close();
		ss.close();
		s.close();

	}
}

	
	
 