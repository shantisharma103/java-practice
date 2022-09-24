class GenClass
{
	static <T>void disp(T arr[])
	{
		for(T i : arr)
		{
			System.out.println(i);
		}
		
	}
}
class GenSecType
{
	public static void main(String args[])
	{
	Integer arr1[]={1,2,3,4,5,6};
	System.out.println("Reading integer object:");
	GenClass.disp(arr1);
	
	String arr2[]={"richa","Sachin","Amit","umika"};
	System.out.println("Reading String object:");
	GenClass.disp(arr2);
	}
}	