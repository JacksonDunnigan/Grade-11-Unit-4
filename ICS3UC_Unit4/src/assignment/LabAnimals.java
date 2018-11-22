package assignment;
import activity4.ValidInput;
import simpleIO.Console;


public class LabAnimals {

	public static void main(String[] args) {
		
		//takes input
		Console.print("Welcome to the lab animal simulation program");
		
		//lets the user see how it works before using the program
		String optionsChoice = Console.readString("Would you like to learn about how this program works? yes, no: ");
    	 if (optionsChoice.equals("yes")) {
    		 Console.print("-----------------------------------------------------------------------------------");
    		 Console.print("The simulation starts with an initial amount of animals (chosen by you).\nThen you will decide how much food the animals will start with as well \nas choosing the amount of food that will be added each day. Every day, the \nanimal population doubles and the food rate you chose gets added to the food supply. \nThe program runs until the population of the animals exceeds the food supply.");
    		 
    	 } 
    	 
    	boolean exit=false;
     	while(!exit) {
     		
			Console.print("-----------------------------------------------------------------------------------");
			int animalAmount =  ValidInput.readIntGreaterThan("Enter the amount of animals: ",0);
			int foodAmount =  ValidInput.readIntGreaterThan("Enter the amount of food to start: ",0);
			int foodRate =  ValidInput.readIntGreaterThan("Enter the amount of food added each day: ",0);
			
			//sets a counter for the days it will take to feed the animals
			int dayCounter = 0;
			
			//calculations
			if (animalAmount !=0)
			{
				while (animalAmount < foodAmount+foodRate ) {
					animalAmount *= 2;
					foodAmount += foodRate;
					dayCounter += 1;
				}
				
				//output
				Console.print("-----------------------------------------------------------------------------------");
				Console.print("It took "+ dayCounter +" days until the animal population exceeded the food supply");
				Console.print("-----------------------------------------------------------------------------------");
				
				
			} else {
				Console.print("-----------------------------------------------------------------------------------");
				Console.print("The population will never exceed food because there’s no animals");
				Console.print("-----------------------------------------------------------------------------------");
			}
			

			//keeps the program running until told to stop
	    	 String exitChoice = Console.readString("Would you like to run another simulation? yes, no: ");
	    	 
	    	 if (exitChoice.equals("yes")) {
	    		 exit = false;
	    	 } else {
	    		 exit = true;
	    	 }
	    	 
    	}
	}
}
