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
		

		System.out.println("Welcom");
	
		}
	}

}
class State_IsA
{
	public static void main(String...s)
	{

	MyThread m1=new MyThread();
		m1.start();
	System.out.println(m1.getState());
	
	MyThread1 m2=new MyThread1();
		m2.start();
	System.out.println(m2.getState());

	}
}


	