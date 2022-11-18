class Mythread extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
		System.out.println("Mythread1:"+i);
		}
	}
}

class Mythread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
		System.out.println("Mythread2:"+i);
		}
	}
}
class MainIs
{

	public static void main(String args[])
	{
	Mythread t1=new Mythread();
		t1.start();
	Mythread t2=new Mythread();
		t2.start();
	}
}
	
	