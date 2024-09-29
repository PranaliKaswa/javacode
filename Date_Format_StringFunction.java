package basics;

import java.util.Date;

public class Date_Format_StringFunction{

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.getTime()); //Current Date
		
		Date d1 = new Date(d.getTime());
		System.out.println(d1);
	
		String current_date = d1.toString();
		
		String year = current_date.substring(current_date.length()-4);
		System.out.println(year);
		
		String date = current_date.substring(8,10);
		System.out.println(date);
		
		String month = current_date.substring(4,7);
		System.out.println(month);
		
		String CurrentDate = date.concat(month).concat(year);
		System.out.println(CurrentDate);
		
		String CurrentDateFormat1 = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(CurrentDateFormat1);
		
		String CurrentDateFormat2 = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(CurrentDateFormat2);
		
		

		Date d2 = new Date();
		System.out.println(d2.getTime());
		Date d3 = new Date(d2.getTime() + (1000*60*60*24*1)); //Future Date
		System.out.println(d3);
		
		String Future_Date = d3.toString();
		
		String year1 = Future_Date.substring(Future_Date.length()-4);
		System.out.println(year1);
		
		String date1 = Future_Date.substring(8,10);
		System.out.println(date1);
		
		String month1 = Future_Date.substring(4,7);
		System.out.println(month1);
		
		String FutureDateFormat1 = date1.concat("-").concat(month1).concat("-").concat(year1);
		System.out.println(FutureDateFormat1);
		
		String FutureDateFormat2 = date1.concat("/").concat(month1).concat("/").concat(year1);
		System.out.println(FutureDateFormat2);
		
		
		
		Date d4 = new Date();
		System.out.println(d4.getTime());
		
		Date d5 = new Date(d4.getTime() - (1000*60*60*24*1)); //Past Date
		System.out.println(d5);
		
        String Past_Date = d5.toString();
		
		String year2 = Past_Date.substring(Past_Date.length()-4);
		System.out.println(year2);
		
		String date2 = Past_Date.substring(8,10);
		System.out.println(date2);
		
		String month2 = Past_Date.substring(4,7);
		System.out.println(month2);
		
		String PastDateFormat1 = date2.concat("-").concat(month2).concat("-").concat(year2);
		System.out.println(PastDateFormat1);
		
		String PastDateFormat2 = date2.concat("/").concat(month2).concat("/").concat(year2);
		System.out.println(PastDateFormat2);
		
		
		
		
		

		

	}

}
