package ObjectExamples;

public class FirstTest {

	static String name="rahul"; //static data
	int id=20; // non static 
	String company="summit"; // non static
	static String secondName="prasanth";
	static String firstName="Rahul";
	static String lasName="Subhash";
	static int rolenumber=309;
	
	/*
	 * this method is used to login into application
	 * username should be like "rahul"
	 * password should be like "test@123"
	 */
	public void login(String username, String password)
	{
		System.out.println("username is "+username);
		System.out.println("password is "+password);
		System.out.println("Logged into application successfully ");
	}
	
	public void login()
	{
		System.out.println("username is rahul");
		System.out.println("password is 23");
	}
	
	
	public void logout()
	{
		System.out.println("this method is used for logging off");
	}
	
	public static void main(String[] args) {
		FirstTest ref = new FirstTest();
		System.out.println(name);
		System.out.println(ref.id);
		System.out.println(ref.company);
		//ref.login();
		ref.logout();
	}
}

/*
 * static
 -> we should declare variables using static keyword
 -> we don't need to create object to use static data
 -> we can access static data by using classname.variablename 
 */

/*non static

-> we should declare non static variables without using static keyword
-> we have to create object for using non static data
-> we can call non static data by using reference.methodName or reference.variableName

*/