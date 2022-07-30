package DailyActions;
import Constructors.*;
public class Example2 {

	public static void main(String[] args) {
		ConstructOver ref = new ConstructOver(10);
		ref.studentUpdate();
		ConstructOver ref1 = new ConstructOver(10,"Rahul");
		ref1.studentUpdate();
		ConstructOver ref2 = new ConstructOver(10,"Rahul","A");
		ref2.studentUpdate();
		
		
	}
}

//public  - u can acccess anywhere in java program
//private - it is limited with in class only
//protected - within the package and outside the package through child class
//default   - with in the package only