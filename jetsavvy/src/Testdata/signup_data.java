package Testdata;

import org.testng.annotations.DataProvider;

public class signup_data {
	
	@DataProvider	
	public static Object[][] signup()
	{
		
		Object[][] data = new Object[1][4];
		
		data[0][0]= "dev jetsetter";
		data[0][1]= "negi";
		data[0][2]= "devendra.singh+26@quadrateglobal.com";
		data[0][3]= "Deepak@123";

		
		return data;
	}

}
