import java.io.*;
class BuffferReader
{
	String name;
	int id;
	int age;
	BuffferReader(String name,int id,int age)
	{	
		this.name=name;
		this.id=id;
		this.age=age;
	}
	void show()
	{
	System.out.println(name);
	System.out.println(id);
	System.out.println(age);

	}
public static void main(String args[])throws Exception
{		

	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter the name");
	String name=r.readLine();
	
	System.out.println("enter the id");
	int id=Integer.parseInt(r.readLine());
		
	System.out.println("enter the age");
	int age=Integer.parseInt(r.readLine());
		
		BuffferReader e1=new BuffferReader(name,id,age);
		e1.show();
	}
}
		


