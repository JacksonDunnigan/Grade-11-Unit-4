package activity5;

import simpleIO.Console;

public class timeConverter {
	public static void main(String[] args) {
		
		// input
		String input;
		do {
			input = Console.readString("Enter a time in 24 hour notation (Hours, Minutes, Seconds): ");
		} while (input.length() <= 7);
//				|| ((input.charAt(1) != ':' || input.charAt(4) != ':') 
//				|| (input.charAt(2) != ':' || input.charAt(5) != ':')));
		
		//creates a time object
		Time t = new Time(input);
		
		//covers the integers to a date
		String date = t.convertTime();
		
		//prints the new date
		Console.print(date);
		
		
	}
}
