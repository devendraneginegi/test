package Testdata;

import org.testng.annotations.DataProvider;

public class search_data {
	
	@DataProvider	
	public static Object[][] search()
	{
		
		Object[][] data = new Object[2][5];
		
		data[0][0]= "LOS ANGELES INTL";
		data[0][1]= "JOHN F KENNEDY INTL";
		data[0][2]= "5";
		data[0][3]= "11:00 PM";
		data[0][4]= "8";

		data[1][0]= "JOHN F KENNEDY INTL";
		data[1][1]= "LESTER B. PEARSON INTL";
		data[1][2]= "6";
		data[1][3]= "02:00 AM";
		data[1][4]= "2";
		
		return data;
	}
	
	@DataProvider	
	public static Object[][] roundtripsearch()
	{
		
		Object[][] data = new Object[2][7];
		
		data[0][0]= "LOS ANGELES INTL";
		data[0][1]= "JOHN F KENNEDY INTL";
		data[0][2]= "11";
		data[0][3]= "10:00 PM";
		data[0][4]= "8";
		data[0][5]= "12";
		data[0][6]= "11:00 PM";	
		
		data[1][0]= "LOS ANGELES INTL";
		data[1][1]= "JOHN F KENNEDY INTL";
		data[1][2]= "13";
		data[1][3]= "10:00 PM";
		data[1][4]= "10";
		data[1][5]= "14";
		data[1][6]= "11:00 PM";	
		return data;
	}

}
