class Mythread extends Thread
{
	public void run()
	{
		{
		System.out.println("good morning");
		}
	}
}
class Mythread1 extends Thread
{
	public void run()
	{
		{
		System.out.println("Rajeev");
		}
	}
}


class GetSet
{

	public static void main(String args[])
	{
		Mythread t =new Mythread();
		t.start();
		t.setPriority(10);
		System.out.println(t.getPriority());
		
		Mythread1 t2 =new Mythread1();
		t2.start();
		t2.setPriority(8);
		System.out.println(t2.getPriority());

	}
}
	
	