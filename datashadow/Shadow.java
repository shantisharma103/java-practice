class Shadow
{
	int x=10;
	void show(int x)
	{
	System.out.println("this is local variable :" + x);
	System.out.println("this is instance variable :" + this.x);
	}
	public static void main(String...s)
	{
	Shadow sd=new Shadow();
	sd.show(20);
	}
}