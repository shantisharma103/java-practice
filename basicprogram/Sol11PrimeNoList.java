import java.util.Scanner;
class Sol11PrimeNoList
{
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of no.");
		int num=sc.nextInt();
		int temp=0;
		for(int i=2; i<=num-1; i++)
		{
		
			if(num % i==0)
				{
					temp=temp+1;
				}
		}
		
			if(temp==0)
			{
				System.out.println("no. is a prime");
			}
			else
			{
				System.out.println("no. is not  prime no");
			}
		
				
	}
}
					
				