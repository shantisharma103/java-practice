 import java.util.Scanner;
class Even
{
	
	public static void main(String...s)
	{
		int num;
		int sum=0;
		System.out.println("enter any  no");
		Scanner sc= new Scanner(System .in);
		num=sc.nextInt();
		if(num % 2 ==0)
		{
			for(int i=0; i<=num; i=i+2)
			{	
				sum=sum+i;
			}
			System.out.println("even no" +sum);
			}
		else
		{
		
			
			System.out.println("odd no");
			
		}
		
	}
}
		