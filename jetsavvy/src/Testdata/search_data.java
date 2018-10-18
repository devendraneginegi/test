package Testdata;
import java.time.LocalDate;


import org.testng.annotations.DataProvider;
public class search_data {
	
	
	
	@DataProvider	
	public static Object[][] search()
	{
		
		Object[][] data = new Object[2][5];
		
		data[0][0]= "LOS ANGELES INTL";
		data[0][1]= "JOHN F KENNEDY INTL";
		data[0][2]=   datedata.onewaydate1;
		data[0][3]= "11:00 PM";
		data[0][4]= "8";

		data[1][0]= "JOHN F KENNEDY INTL";
		data[1][1]= "LESTER B. PEARSON INTL";
		data[1][2]= datedata.onewaydate2;
		data[1][3]= "02:00 AM";
		data[1][4]= "9";
		
		
		
		return data;
	}
	
	@DataProvider	
	public static Object[][] roundtripsearch()
	{
		
		Object[][] data = new Object[2][7];
		
		data[0][0]= "LOS ANGELES INTL";
		data[0][1]= "JOHN F KENNEDY INTL";
		data[0][2]= datedata.roundtripdate1;
		data[0][3]= "10:00 PM";
		data[0][4]= "10";
		data[0][5]= datedata.roundtripdate2;
		data[0][6]= "11:00 PM";	
		
		data[1][0]= "LOS ANGELES INTL";
		data[1][1]= "JOHN F KENNEDY INTL";
		data[1][2]= datedata.roundtripdate3;
		data[1][3]= "10:00 PM";
		data[1][4]= "11";
		data[1][5]= datedata.roundtripdate4;
		data[1][6]= "11:00 PM";	
		return data;
	}
	
	@DataProvider	
	public static Object[][] multitripsearch()
	{
		
		Object[][] data = new Object[1][10];
		
		data[0][0]= "LOS ANGELES INTL";
		data[0][1]= "JOHN F KENNEDY INTL";
		data[0][2]= datedata.multitripdate1;
		data[0][3]= "01:00 PM";
		data[0][4]= "10";
		data[0][5]= "JOHN F KENNEDY INTL";
		data[0][6]= "LOS ANGELES INTL";	
		data[0][7]= datedata.multitripdate2;
		data[0][8]= "11:00 PM";	
		data[0][9]= "11";
		
		return data;
	}

}
