package activity5;


public class Time {
	//creates variables to hold the hours, minutes and seconds
	int hours,minutes,seconds;
	
	Time(String time) {
		
		// splices the input to a series of integers
		hours = Integer.parseInt(time.substring(0, time.indexOf(':') ));
		minutes = Integer.parseInt(time.substring(time.indexOf(':') + 1, time.lastIndexOf(':')));
		seconds = Integer.parseInt(time.substring(time.lastIndexOf(':') + 1, time.length() ));
	}


	// converts the time to 12 hour notation
	public String convertTime() {
		String output;
		String ending = "PM";

		//makes the time 12 hour notation
		if (hours >= 12) {

			if (hours >= 13) {
				hours -= 12;
				ending = "PM";
			}

		} else {
			ending = "AM";
		}

		// makes it a new string
		output = ""+ hours + ':' + minutes + ':' + seconds + ' ' + ending;
		
		//returns the new time created
		return output;
	}

}