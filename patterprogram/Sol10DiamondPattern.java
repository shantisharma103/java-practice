class Sol10DiamondPattern
{
	public static void main(String args[])
	{
	 	int num=5;
		for(int i= 1;i<=num; i++) 
		{
			int p=1;
			for(int j=i; j<=num; j++)
			{
	    			System.out.print(" ");
			}			 
			
			for(int j=1;j<i; j++) 
			{
				
	    			System.out.print(p+++" ");
			}
			for(int j=1;j<=i; j++) 
			{
				
	    			System.out.print(p+++" ");
			}
			
			System.out.println();
		}
		
	}
}