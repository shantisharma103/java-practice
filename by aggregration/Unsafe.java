class Reserve implements Runnable
{
//available birth=1
	int available=1;
	int wanted;
	
	Reserve(int i)
	{
		wanted = i;
	
	}
	public void run()
	{
		System.out.println("Available birth=" +available);

			if(available >= wanted)
			{
				String name=Thread.currentThread().getName();

				System.out.println(wanted + "birth reserved for"+name);
				try
				{
			
				Thread.sleep(1000);//wait for print the ticket
					available= available- wanted;
				}
				catch(Exception e)
				{}
			}
		else
		
		System.out.println("sorry ,no birth Available");
		
	}
	
}
class Unsafe
{
	public static void main(String args[])
	{
	Reserve obj=new Reserve(1);
//attached first thread to object

	Thread t1= new Thread(obj);
//attached second  thread to object

	Thread t2= new Thread(obj);
//taken thread name as person

	 t1.setName("first person");

	t2.setName("Second  person");

//send request for birth
	t1.start();
	t2.start();
	}
}

