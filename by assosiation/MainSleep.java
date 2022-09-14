class Mythread extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
		
		System.out.println("Mythread1:"+i);
		try
			{
			Thread.sleep(1000);
			}
			catch (Exception e)
			{
			System.out.println(e);
			}
		}

	}
}


class MainSleep
{

	public static void main(String args[])
	{
	Mythread t1=new Mythread();
		t1.start();
	
	}
}
	
	