class ArrayOverlap
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40};
		m1(a);
		for(int i=0; i<a.length;i++)
		{
		System.out.println(a[i]+"\t");
		
		}
		
	}
	static void m1(int ia[])
	{
		ia[1]=4;
		ia[2]=5;
	}
}



