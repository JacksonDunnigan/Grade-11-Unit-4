package assignment;
import activity4.ValidInput;
import simpleIO.Console;

public class ELR {

	public static void main(String[] args) {
		
		Console.print("Welcome to The Environmental Lapse Rate simulation");
   	 
	   	boolean exit=false;
    	while(!exit) {
    		
    		//input
			int degreeType = ValidInput.readIntBetween("Enter temperature type you wish to use: \n1) Celcius\n2) Fahrenheit ", 1 ,2);
			double temp = Console.readDouble("Enter the temperature at sea level: ");
			int altitude = ValidInput.readIntGreaterThan("Enter the altitude (metres): ", 0);
			
			//sets extra variables
			double tempRate = 0;
			String outputTemp = "";
			
			
			//starts at 0.0065 not 0.65 for more exact temperature measurement as well as sets a rate for fahrenheit measurement.
			if (degreeType == 1) {
				tempRate = 0.0065;
				outputTemp = "celcius";
				
			} else if (degreeType == 2){
				tempRate = 0.0117;
				outputTemp = "Fahrenheit";
			}
			
			
			//calculations
			for (int i = 0; i < altitude; i++) {
				temp += tempRate;
			}
			
			//output
			Console.print("--------------------------------");
			Console.print("The temperature at " + altitude + "m is " + Console.roundDouble(temp, 2) + " degrees " + outputTemp);
			
			//keeps the program running until told to stop
	    	 String exitChoice = Console.readString("Would you like to run another simulation? yes, no: ");
	    	 
	    	 if (exitChoice.equals("yes")) {
	    		 exit = false;
	    	 } else {
	    		 exit = true;
	    	 }
	    	 Console.print("--------------------------------");
    	}
	}
}
