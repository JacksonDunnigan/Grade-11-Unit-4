package activity5;

public class Time {
	String time;
	int hour;
	int minute;
	int second;
	
	Time(String time){
	}
	
	// converts the string to integers
	public int convertToInt() {

		hour = Integer.parseInt(time.substring(0, time.indexOf(":")-1));
		minute = Integer.parseInt(time.substring(time.indexOf(":"), time.indexOf(":",time.indexOf(":"))-1));
		second = Integer.parseInt(time.substring(time.indexOf(":"), time.length()-1));
		
		return hour;
	}
	
	
	
	// converts the time to 12 hour notation
	public String convertDay() {
		String date;
		String ending = "AM";
		
		if (hour>=12) {
			ending = "PM";
			
			if (hour>=13) {
				hour -= 12;
			}
			
		} else {
			ending = "AM";
		}
		
		//makes it a new string
		date = hour+':'+minute+':'+second+':'+ending;
		return date;
	}

}