import java.util.Scanner;
class Sol4SwapNoWithStatic
{
	static void swapvalue(int a,int b)
	{
		int temp=a;
			a=b;
			b=temp;
		System.out.println("after swapping no."+ a+" " +b);

	}
	public static void main(String args[])
	{

		int a=9, b=4;
		swapvalue(a, b);

	}
}