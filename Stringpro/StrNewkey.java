class StrNewkey
{
	public static void main(String args[])
	{
		String s=new String("Shanti");
		String s1="Shanti";
		String s2= s.intern();
		
		if(s1==s2)
		{
		
		System.out.println("ref matched");
		}
		else
		{
		
		System.out.println("ref not matched");
		}
	}
}