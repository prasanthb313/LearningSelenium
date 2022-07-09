package ObjectExamples;

public class SecondTest {
 public static void main(String[] args) {
	 
/*	System.out.println(FirstTest.name);
	System.out.println(FirstTest.firstName);
	System.out.println(FirstTest.lasName);
	System.out.println(FirstTest.rolenumber);
	System.out.println(FirstTest.name);
	System.out.println(FirstTest.name);
	FirstTest.main(args);
	
	*/
	//non static variables accessing
	 
	FirstTest ref = new FirstTest();
	//ref.login("rahul",23);
	ref.login();
	ref.logout();
}
}

