package dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterDemo {

	public static void main(String[] args) throws ParseException {
		Date date = new Date(System.currentTimeMillis());

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss,SSS");
		System.out.println("Date: "+ dateFormat.format(date));

		//Converting String into Date
		String myDate = "20-12-1987";		
		//small case “m” represent minutes while “M” represent Month Also “d” represent date in month while “D” represent Day of week.
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dateFormat2.parse(myDate));//22-12-2016
		
		String myDate2 = "02 Sep 2016";		
		//small case “m” represent minutes while “M” represent Month Also “d” represent date in month while “D” represent Day of week.
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("DD MMM yyyy");
		System.out.println(dateFormat3.parse(myDate2));
	}

}
