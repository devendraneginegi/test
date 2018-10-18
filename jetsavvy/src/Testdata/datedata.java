package Testdata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class datedata {
	
	static LocalDate date = LocalDate.now();
    static LocalDate oneway_date1 = date.plusDays(1);
    static LocalDate oneway_date2 = date.plusDays(2); 
    static LocalDate roundtrip_date1 = date.plusDays(3); 
    static LocalDate roundtrip_date2 = date.plusDays(4); 
    static LocalDate roundtrip_date3 = date.plusDays(5); 
    static LocalDate roundtrip_date4 = date.plusDays(6); 
    static LocalDate multitrip_date1 = date.plusDays(7);
    static LocalDate multitrip_date2 = date.plusDays(8); 
   
    static String onewaydate1=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(oneway_date1).toString();      
    static String onewaydate2=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(oneway_date2).toString();
    static String roundtripdate1=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(roundtrip_date1).toString();
    static String roundtripdate2=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(roundtrip_date2).toString();
    static String roundtripdate3=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(roundtrip_date3).toString();
    static String roundtripdate4=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(roundtrip_date4).toString();
    static String multitripdate1=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(multitrip_date1).toString();
    static String multitripdate2=DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(multitrip_date2).toString();

}
