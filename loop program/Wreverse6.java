import java .util.Scanner;

class Wreverse6
{
	public static void main(String...s)
	{
		int n,r;
		System.out.println("enter any no");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			System.out.println("reverse no" + r);
			n= n/10;
		}
	}
}