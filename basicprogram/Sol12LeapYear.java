import java.util.Scanner;
class Sol12LeapYear
{
	public static void main(String args[])
	{
		int year;
		Scanner sc=new Scanner(System.in);
		
		year=sc.nextInt();
		if(year % 4==0)
		{
			if(year % 100==0)
			{
				if((year % 400==0)
				{
					System.out.println("leap year ");
				}
				else
				{
					System.out.println("non leap year");
				}
			}
			else
			{
			System.out.println(" leap year");
			}
		}
		else
		{
			System.out.println("non leap year");
		}

		
	}
}
					
				