import java.util.Scanner;
class LargSmall12
{
	
	public static void main(String...s)
	{
		int num;
		int smallest=9, largest=0;
		System.out.println("enter any  no");
		Scanner sc= new Scanner(System .in);
		num=sc.nextInt();
		while(num !=0)
		{
			int digit= num % 10;
			if(digit < smallest)
				smallest = digit;
			else if(digit > largest)
				largest = digit;
				num = num /10;
				
		}
		System.out.println("largest no :" + largest );
		System.out.println("smallest no : " + largest );
			
		
			
	}
		
	
}
		