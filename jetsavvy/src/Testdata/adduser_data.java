package Testdata;

import org.testng.annotations.DataProvider;

public class adduser_data {
	@DataProvider	
	public static Object[][] adduser()
	{
		
		Object[][] data = new Object[1][6];
		
		data[0][0]= "Child";
		data[0][1]= "Dev";
		data[0][2]= "Negi";
		data[0][3]= "test101@gmail.com";
		data[0][4]= "Test@12345";
		data[0][5]= "9654560796";

		
		return data;
	}
}
