package activity5;

import simpleIO.Console;

public class timeConverter {
	public static void main(String[] args) {
		
		// input
		String input = Console.readString("Enter a time in 24 hour notation: ");
		
		//creates a time object
		Time t = new Time(input);
//		Console.print(t.hours);
//		Console.print(t.minutes);
//		Console.print(t.seconds);
		
		//covers the integers to a date
		String date = t.convertTime();
		
		//prints the new date
		Console.print(input + " in 12 hour notation is: "+date);
		
		
	}
}
