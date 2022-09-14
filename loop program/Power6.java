import java .util.Scanner;

class Power6
{
	public static void main(String...s)
	{
		int num , p, result=1;
		System.out.println("enter any no.");
		Scanner sc =new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("enter power");
		p = sc.nextInt();
		for(int i=1; i<=p ; i++)
		{
			
			result=num*result;
		}
		System.out.println(result);
	}
}