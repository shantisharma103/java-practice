import java.util.Scanner;
class Seri15
{
	public static void main(String...s)
	{
	int n;
	double sum=0.0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter serie");
	n =sc.nextInt();
	
	for(int i=1; i<=n; i++)
	{
	 sum= sum + (double)1/i;
	}
	System.out.println(sum);
	}
}
