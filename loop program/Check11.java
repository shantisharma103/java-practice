import java.util.Scanner;
class Check11
{
	
	public static void main(String...s)
	{
		int num;
		int count=0;
		System.out.println("enter any  no");
		Scanner sc= new Scanner(System .in);
		num=sc.nextInt();
		if(num > 0)
		{
			System.out.println("positive no");
			
		}
		else if(num < 0)
		{
			System.out.println("negative no.");
		}
		else
		{
			System.out.println("niether positive nor negative no");
		}
		
	}
}
		