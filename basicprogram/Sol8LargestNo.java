import java.util.*;
class Sol8LargestNo
{
	public static void main(String args[])
	{
		int a,b,c,larg;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first no.");
		a=sc.nextInt();
		
		System.out.println("enter second no.");
		b=sc.nextInt();
		
		System.out.println("enter third no.");
		c=sc.nextInt();
		
		larg=c> (a>b? a:b)? c:((a>b)? a:b);		
		
		System.out.println("largest no."+larg);
		
	}
}