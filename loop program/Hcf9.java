class Hcf9
{
	public static void main(String...s)
	{
		
		int a=4;
		int b=8;
		int hcf=1;
		for (int i=1; i<=a && i<=b; i++) 
		{
			if(a % i==0 && b % i==0)
			{ 
			hcf=i;
			}
		}
		System.out.println(hcf);
	}
}
		