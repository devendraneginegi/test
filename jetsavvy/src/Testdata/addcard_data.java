package Testdata;

import org.testng.annotations.DataProvider;

public class addcard_data {
	
	@DataProvider	
	public static Object[][] addcard()
	{
		
		Object[][] data = new Object[1][12];
		
		data[0][0]= "American Express";
		data[0][1]= "375987653211123";
		data[0][2]= "Jan";
		data[0][3]= "2020";
		data[0][4]= "123";
		data[0][5]= "Devendra";
		data[0][6]= "address1 calony";
		data[0][7]= "address2 calony";
		data[0][8]= "Canada";
		data[0][9]= "Alberta";
		data[0][10]= "canada city";
		data[0][11]= "12345";

		
		return data;
	}
}
