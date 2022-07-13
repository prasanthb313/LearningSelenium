package DailyActions;

import ExamplesMethod.NumberActions;

public class NumberActivity {
	public static void main(String[] args) {
		
		NumberActions ref = new NumberActions();
		//addition of numbers
		
		int i=10;
		int j=20;
		int k=30;
		
		int l=2;
		//ref._multiplicationOfNumbers123(i,j);
		//ref.addNumbers(i, j);
		int sum=ref.addNumber(j, i, k);
		
		
		System.out.println("final result is  "+sum*l);
	}
}

