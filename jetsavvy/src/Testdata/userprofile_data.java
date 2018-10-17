package Testdata;

import org.testng.annotations.DataProvider;

public class userprofile_data {
	@DataProvider	
	public static Object[][] userprofile()
	{
		
		Object[][] data = new Object[1][8];
		
		data[0][0]= "Jan";
		data[0][1]= "1";
		data[0][2]= "1901";
		data[0][3]= "Male";
		data[0][4]= "Akan";
		data[0][5]= "Adampur Airport";
		data[0][6]= "Afghanistan Afghani";
		data[0][7]= "9654560796";

		
		return data;
	}
}
