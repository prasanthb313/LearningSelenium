package Constructors;

public class ConstructOver {

	int a;
	String b;
	String c;
	
	public ConstructOver(int i)
	{
		a=i;		
	}
	ConstructOver(String name)
	{
		b=name;	
	}
	public ConstructOver(int i, String name)
	{
		a=i;
		b=name;
		System.out.println();
	}
	public ConstructOver(int i, String name,String section)
	{
		a=i;
		b=name;
		c=section;
		System.out.println();
	}
	
	public void studentUpdate()
	{
		System.out.println("number is "+a);
		System.out.println("name is "+b);
		System.out.println("section is "+c);
		
	}
}

