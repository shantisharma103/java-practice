class Test implements Runnable
{
	public void run()
	{
	 
		for(int i=1; i<=5; i++)
		{
		System.out.println("my child thread");
		}
	}
}		
class Result
{
	
	 public static void main(String args[])
	{
		Test t=new Test();
		Thread d=new Thread(t);
			d.start();
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("result thread");
		}
	}
}