package ExamplesMethod;

public class NumberActions {

	
	/*
	 * This method is used to add numbers
	 */
	public void addNumbers(int a,int b)
	{
		int c=a+b;
		System.out.println("after adding numbers result is "+c);
	}
	
	
	/*
	 * this method is used to multiply given numbers
	 */
	public void _multiplicationOfNumbers123(int a,int b)
	{
		int c=a*b;
		System.out.println("after Multiplication numbers result is "+c);
	}
	
	//Access specifier // return type  //method name
	public             int 				addNumber(int a,int b,int c)
	{
		//method body
		int d=a+b+c;
		
		return d;
	}
}


/* always method name should start with lower case letter
 * Method can contain underscores
 * Method name should not start with numbers
 * every method should have return type
 *  -> if we put method return type as void, we don't need to return anything
 *  -> if we put method return type as int, we need to return integer
 */
