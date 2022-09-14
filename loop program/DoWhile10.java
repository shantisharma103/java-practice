import java.util.Scanner;
class DoWhile10
{
	public static void main(String...s)
	{
		
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		int sum;
		w;
		do
		{
			System.out.println("enter Ist num");
			n1=sc.nextInt();
	
			System.out.println("enter 2nd num");
			n2=sc.nextInt();
			sum= n1+n2;
			System.out.println(sum);
			System.out.println(" want perform operation yes/no");
			w=sc.next().char(0);
			System.out.println();
		}
		while(wish=='yes' || w == 'yes' );
	
	 	
	}
	
}
