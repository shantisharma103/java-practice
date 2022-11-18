import java.util.Scanner;
class Sol13Armstrong
{
	public static void main(String...s)
	{
	int n,c,rem;
	int arm=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any num");
	n=sc.nextInt();
	c= n;
	while(n>0)
	{
	 	rem=n % 10;
		arm=(rem* rem* rem)+arm;
		n=n/10;
	}
	if(c==arm)
		System.out.println("armstrong no");
	else
		System.out.println("not a armstrong no");
	}
	
}