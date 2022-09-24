class GenericClass<T>
{
	T obj;
	GenericClass(T obj)
	{
		this.obj=obj;
	}
	T getobj()
	{
		return obj;
	}
}
class Genpro
{
	public static void main(String args[])
	{
	Integer i=12;
	GenericClass<Integer> obj=new GenericClass<Integer>(i);
	System.out.println(obj.getobj());
	
	Float j=15.5f;
	GenericClass<Float> obj1=new GenericClass<Float>(j);
	System.out.println(obj1.getobj());
	
	String s="ram";
	GenericClass<String> obj2=new GenericClass<String>(s);
	System.out.println(obj2.getobj());
	}
}

	
	
	
	
	
	
 