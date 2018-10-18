package Testdata;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login_data {
	
	
	
	
	//@Test(dataProviderClass = TestNGDataProvider.class, dataProvider = "testSumInput")
	
	@DataProvider	
	public static Object[][] loginjetsetter()
	{
		
		Object[][] data = new Object[1][2];
		
		data[0][0]= "devendra.singh+90@quadrateglobal.com";
		data[0][1]= "Deepak@123";
		
		
	//	data[1][0]= "devendra.negi+1@quadrateglobal.com";
	//	data[1][1]= "Deepak@1234";
		
		return data;
	}
	
	@DataProvider	
	public static Object[][] loginbroker()
	{
		
		Object[][] data = new Object[2][2];
		
		data[0][0]= "devendra.singh+2@quadrateglobal.com";
		data[0][1]= "Deepak@123";
		
		
		data[1][0]= "devendra.negi+2@quadrateglobal.com";
		data[1][1]= "Deepak@1234";
		
		return data;
	}
	
	@DataProvider	
	public static Object[][] loginjetowner()
	{
		
		Object[][] data = new Object[2][2];
		
		data[0][0]= "devendra.singh@quadrateglobal.com";
		data[0][1]= "Deepak@123";
		
		
		data[1][0]= "devendra.negi@quadrateglobal.com";
		data[1][1]= "Deepak@1234";
		
		return data;
	}
	@DataProvider	
	public static Object[][] loginjetoperator()
	{
		
		Object[][] data = new Object[2][2];
		
		data[0][0]= "devendra.singh+1@quadrateglobal.com";
		data[0][1]= "Deepak@123";
		
		
		data[1][0]= "devendra.negi+1@quadrateglobal.com";
		data[1][1]= "Deepak@1234";
		
		return data;
	}

}
