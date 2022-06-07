package common;
import day1.Convert;
import day1.DataTypesandVariables;

public class Main {

	public static void main(String[] args) {
		DataTypesandVariables.printString("*** Bài 4 *** \n");
		boolean x = true;
		DataTypesandVariables.printString("Before: " +x);
		x= false;
		DataTypesandVariables.printString("After: " + x +"\n");
		
		DataTypesandVariables.printString("*** Bài 6 *** \n");
		
		Convert.convert(212f);
		
		DataTypesandVariables.printString("*** Bài 7 *** \n");
		
		Convert.convertInchtoMeter(1000);
		
		DataTypesandVariables.printString("***B:Operators Bài 2 *** \n");
		
		Convert.speed(2500, 5, 56, 23);
		
		DataTypesandVariables.printString("*** B:Operators Bài 3 *** \n");
		Convert.math(25, 5);
		DataTypesandVariables.printString("*** B:Operators Bài 4 *** \n");
		Convert.breakInt(123456);
		DataTypesandVariables.printString("*** C:Decision Making Bài 1 *** \n");
		Convert.sumdigits(565);
		DataTypesandVariables.printString("*** C:Decision Making Bài 2 *** \n");
		Convert.covertMintoDate(3456789);
	}

}
