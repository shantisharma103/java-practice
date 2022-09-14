import java.util.*;
class Fact
{
	public static void main(String...s)
	{
		int n , fact =1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number" );
		
		n= sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			
			fact=fact*i;
				
		}
			System.out.println("factotial of the no is:"   +  fact);
	}	



}