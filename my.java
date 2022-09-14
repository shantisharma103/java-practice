interface my
{
	int sum(int a ,int b);
}
	class child
	{
	public static void main(String args[])
	{
		int x =10; 
		//using lambda exp
		my m1=(a, b)->(a+b);
				{
					System.out.println(m1.sum(10,20));			
				};
		//multiple parameter with datatype inlambda exp
		my m2=(int a,int b)->(a+b);
		System.out.println(m2.sum(1,2));			
	}
	}
		