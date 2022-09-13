class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
		System.out.println("thread1:"+i);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
		System.out.println("thread2:"+i);
		}
	}
}


class Pri
{

	public static void main(String args[])
	{
		Thread t1 =new Thread();
		t1.start();
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		
		Thread2 t2 =new Thread2();
		t2.start();
		t2.setPriority(8);
		System.out.println(t2.getPriority());

	}
}
	
	