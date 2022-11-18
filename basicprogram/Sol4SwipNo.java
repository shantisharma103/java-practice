import java.util.Scanner;
class Sol4SwipNo
{
	public static void main(String args[])
	{

		int x,y,t;
		Scanner sc =new Scanner(System.in);
		System.out.println("entered vaule of xand y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("before swapping no."+ x+" " +y);
		
		 t=x;
		 x=y;
		y=t;
		System.out.println("after swip no :"+x+" "+y);
		System.out.println();

	}
}
		