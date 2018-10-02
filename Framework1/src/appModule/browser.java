package appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Constant;

public class browser {
	
//	private static WebDriver driver2=null;
	
	//private static ChromeDriver driver;

	public static WebDriver get_browser(WebDriver driver1,String browser)
	
	{
		
		
	if(browser.equalsIgnoreCase("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "D://Chrome driver//chromedriver.exe");

			

		  driver1 = new ChromeDriver();
		  
		//  driver.get(Constant.URL);
		 
			System.out.println("chrome");

		 
		//return driver1;
	}	
		else
		{
		
			
			 System.setProperty("webdriver.gecko.driver", "D://Chrome driver//geckodriver.exe");

				

			  driver1 = new FirefoxDriver();
			  
			//  driver.get(Constant.URL);
			 
				System.out.println("firefox");

			 
		//	return driver1;
		}
		
	return driver1;
			
		

}
}
