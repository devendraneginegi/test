package Testdata;

import org.testng.annotations.DataProvider;

public class search_data {
	
	@DataProvider	
	public static Object[][] search()
	{
		
		Object[][] data = new Object[2][5];
		
		data[0][0]= "ind";
		data[0][1]= "ind";
		data[0][2]= "9/25/2018";
		data[0][3]= "12:00 AM";
		data[0][4]= "1";

		data[1][0]= "ind";
		data[1][1]= "CHHATRA";
		data[0][2]= "9/30/2018";
		data[1][3]= "12:00 AM";
		data[1][4]= "2";
		
		return data;
	}

}
