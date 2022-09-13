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

class MyThread2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
		System.out.println("Mythread2:"+i);
		}
	}
}
class MainImplement	
{

	public static void main(String args[])
	{
	MyThread t1=new MyThread();
	Thread tt=new Thread(t1);
		tt.start();
	MyThread2 t2=new MyThread2();
		Thread ttt=new Thread(t2);
		ttt.start();
	}
}
	
	