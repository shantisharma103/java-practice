import java.util.Scanner;

class Sol2GetInpFrmUsr
{

	public static void main(String args[]) 
	{
		
		Scanner sc=new Scanner(System.in);
    
		System.out.println("enter any integer value");
    	
		int a = sc.nextInt();
		System.out.println("integer value = "+a);
	
		float f = sc.nextFloat();
		System.out.println("float value= "+f);
	
		char c  = sc.next().charAt(0); 
		System.out.println("char value ="+c);
	
		String str = sc.nextLine();
		System.out.println("integer value ="+str);

	}
}