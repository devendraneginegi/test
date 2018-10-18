package javaprogram;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class datedate {
	

	java.util.Date date1=new java.util.Date(); 
	

    SimpleDateFormat formatNowDay = new SimpleDateFormat("dd MMMM, YYYY");
    SimpleDateFormat formatNowDay1 = new SimpleDateFormat("dd MMMM, YYYY");
    SimpleDateFormat formatNowMonth = new SimpleDateFormat("MMMM");// MM for number
    SimpleDateFormat formatNowYear = new SimpleDateFormat("YYYY");

    String currentDay = formatNowDay.format(date1);
    String currentMonth = formatNowMonth.format(date1);
    String currentYear = formatNowYear.format(date1);
    
 //   System.out.println(currentDay);
  //  System.out.println(currentMonth);
  //  System.out.println(currentYear);
    
    

   
        LocalDate date = LocalDate.now();
        LocalDate oneway_date1 = date.plusDays(1);
        LocalDate oneway_date2 = date.plusDays(2); 
        LocalDate roundtrip_date1 = date.plusDays(3); 
        LocalDate roundtrip_date2 = date.plusDays(4); 
        LocalDate roundtrip_date3 = date.plusDays(5); 
        LocalDate roundtrip_date4 = date.plusDays(6); 
        LocalDate multitrip_date1 = date.plusDays(7);
        LocalDate multitrip_date2 = date.plusDays(8); 
       
        public String onewaydate1=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(oneway_date1).toString();      
        String onewaydate2=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(oneway_date2).toString();
        String roundtripdate1=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(roundtrip_date1).toString();
        String roundtripdate2=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(roundtrip_date2).toString();
        String roundtripdate3=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(roundtrip_date3).toString();
        String roundtripdate4=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(roundtrip_date4).toString();
        String multitripdate1=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(multitrip_date1).toString();
        String multitripdate2=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(multitrip_date2).toString();
  //      System.out.println(onewaydate1);
    //    System.out.println(onewaydate2);
       


}
