import java.util.Scanner;
class Series16
{
	public static void main(String...s)
	{
	int n;
	double sum=0.0;
	int sign=-1;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter serie");
	n =sc.nextInt();
	for(int i=1; i<=n; i++)
	{
		sign*=-1;
	  sum +=( (double)sign*i);
	} 
	System.out.println(sum);
	}
}
