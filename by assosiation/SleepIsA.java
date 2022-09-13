class MyThread extends Thread 
{
	public void run()
	{
		while(true)
		{
		System.out.println("good morning");
		}
	}
}
class MyThread1 extends Thread 
{
	public void run()
	{
		while(true)
		{
			try
			{
			Thread.sleep(millis:200);
			}
			catch (Exception e)
			{
		
			System.out.println(e);
			}

		System.out.println("Welcom");
	
		}
	}

}
class Sleep_IsA
{
	public static void main(String...s)
	{

	MyThread m1=new MyThread();
		m1.start();
	
	MyThread1 m2=new MyThread1();
		m2.start();
	}
}


	