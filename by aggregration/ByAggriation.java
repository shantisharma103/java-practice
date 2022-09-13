class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
		System.out.println("Mythread1:"+i);
		}
	}
}

class ByAggriation
{

	public static void main(String args[])
	{
	MyThread t1=new MyThread();
	Thread tt=new Thread(t1);
		tt.start();
	
	}
}
	