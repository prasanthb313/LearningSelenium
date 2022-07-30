package Constructors;

public class StudentInformation {

	int i;
	String name;
	StudentInformation()
	{
		System.out.println("Calling default constructor");
		System.out.println(i+name);
	}
	
	public static void main(String[] args) {
		StudentInformation ref = new StudentInformation();
	}
}



//Rules
//Constructor name should be same as Class Name
//