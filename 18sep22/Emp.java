class Emp
{
	int eno;
	String ename;
	Emp(int eno,String ename)
{
	this.eno=eno;
	this.ename=ename;
}
	void disp()
	{
	System.out.println(eno);
	System.out.println(ename);
	}
}
	class Emp_Main
	{
	public static void main(String args[])
	{	
	Emp emp[]=new Emp[2];
	emp[0]=new Emp(1,"ram");
	emp[1]=new Emp(2,"uma");
	
	for(int i=0; i<emp.length;i++)
	{
	Emp e=emp[i];
	if(e!=null)
	e.disp();
	}
}
}


