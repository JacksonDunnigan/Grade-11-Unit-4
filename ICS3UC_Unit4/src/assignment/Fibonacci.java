package assignment;
import simpleIO.Console;
import activity4.ValidInput;

public class Fibonacci {

	public static void main(String[] args) {
		
		//takes input
		Console.print("Welcome to the Fibonacci sequence calculator");
   	 
	   	boolean exit=false;
    	while(!exit) {
			int index = ValidInput.readIntBetween("Enter a value (between 1 and 92): ", 1, 92);
			Console.print("--------------------------------");
			
			long[] numList = new long[index];
			numList[0] = 1;
			
			
			//fills the list with numbers
			if (index > 1) {
				numList[1] = 1;
				for (int i = 2; i < numList.length; i++) {
					numList[i] = numList[i-1] + numList[i-2];
				}
			}
	
			
			//gets the number in the sequence
			Console.print(index + " in the Fibonacci sequence is: " + numList[numList.length-1]);
			String tableChoice = Console.readString("Would you like to see that as a table? yes or No: ");
			
			//makes the sequence into a table
			if (tableChoice.equals("yes")){
				Console.print("--------------------------------");
				Console.print("Index \t Value");
				for (int i = 1; i < numList.length+1; i++) {
					Console.print(i + "\t" + numList[i-1]);
				}
			}
			
			
			//keeps the program running until told to stop
			Console.print("--------------------------------");
	    	 String exitChoice = Console.readString("Would you like to find more numbers? yes, no: ");
	    	 
	    	 if (exitChoice.equals("yes")) {
	    		 exit = false;
	    	 } else {
	    		 exit = true;
	    	 }
	    	 Console.print("--------------------------------");
		}
	}
}