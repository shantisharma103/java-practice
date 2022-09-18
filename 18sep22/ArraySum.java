class ArraySum
{
	public static void main(String args[])
	{
		int array[]={5,15,25,35,45,55,65};
		int sum=0;
		sum=sumofArray(array);
		System.out.println("sum of "+"arrayelement"+"sum");
		}
		static int sumofArray(int a[])
		{
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
		System.out.println(a[i]+"\t");
		sum+=a[i];
		}
		return sum;
	}
}




