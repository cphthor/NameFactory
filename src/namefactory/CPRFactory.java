package namefactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CPRFactory {
	Date date;
	int year;
	int month;
	int day;
	int control;
	String yearS;
	String monthS;
	String dayS;
	String controlS;
	
	public String createCPR() {
		DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		format.setLenient(false);
		// 070761   4285
		Random  r = new Random();
		year = r.nextInt(99);
		month = r.nextInt(11) + 1;
		day = r.nextInt(30) + 1;
		while(control%2 == 0) {
			control = r.nextInt(8999)+1000;
		}
		if (day < 10) {
			dayS = "0" + Integer.toString(day);
		} else {
			dayS = Integer.toString(day);
		}
		if (month < 10) {
			monthS = "0" + Integer.toString(month);
		} else {
			monthS = Integer.toString(month);
		}
		yearS = Integer.toString(year);
		String dateString = monthS + "-" + dayS + "-" + (1900+year);
//System.out.println(dateString);
try {
	Date date = format.parse(dateString);
} catch (Exception e) {
	//System.out.println("Error");
	//System.out.println(e);
	createCPR();
}

String cprString = monthS+dayS+yearS+control;
//System.out.println(cprString);
return cprString;
	}
	
	public int getNumbers() {
		return 0;
	}
	
}
