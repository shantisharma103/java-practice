class Copycon
{
	int x,y;
	Copycon(int x,int y)
	{
		this.x= x;
		this.y= y;
	}
	Copycon(Copycon z)
	{
		this.x= z. x;
		this.y= z. y;
	}
	void show()
	{
	System.out.println(x);
	System.out.println(y);
	}
	public static void main(String...s)
	{
	 Copycon c1 = new Copycon(10,20);
	c1.show();
	 Copycon c2 = new Copycon(c1);
	c2.show();
	}
}
 
	
	

	