import java.util.Scanner;
class Prime8
{
	
	public static void main(String...s)
	{
		int num;
		int count=0;
		System.out.println("enter any  no");
		Scanner sc= new Scanner(System .in);
		num=sc.nextInt();
		for(int i= 1; i<= num; i++)
		{
			if(num % i==0)
			{
			count++;
			}
		}
		if(count==2)
		System.out.println("prime no");
		else
		System.out.println("not a  prime ");
		
	}
}
		