package activity5;


public class Time {
	//creates variables to hold the hours, minutes and seconds
	int hours,minutes,seconds;
	String t;
	Time(String time) {
		t=time;
		// splices the input to a series of integers
		hours = Integer.parseInt(time.substring(0, time.indexOf(':')));
		minutes = Integer.parseInt(time.substring(time.indexOf(':') + 1, time.lastIndexOf(':')));
		seconds = Integer.parseInt(time.substring(time.lastIndexOf(':') + 1, time.length()));
	}


	// converts the time to 12 hour notation
	public String convertTime() {
		String output;
		String ending = "PM";

		//makes the time 12 hour notation
		if (hours <= 24 && hours > 0 && minutes < 60 && minutes > 0 && seconds < 60 && seconds > 0){

			if (hours >= 13) {
				hours -= 12;
				ending = "PM";
			} else if (hours < 12){
				ending = "AM";
			}

			output = t+" in 12 hour notation is: " + hours + ':' + minutes + ':' + seconds + ' ' + ending;
		}
		//outputs invalid time if the hours is greater than 24
		else {
			output = "Invalid time";
		}

		//returns the new time created
		return output;
	}

}