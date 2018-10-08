package Test_Cases;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.search_page;
import Page_Object.search_result_page;
import Testdata.search_data;

public class roundtrip_search {
	
	WebDriver driver;
	 
	 @BeforeTest()
	 public void openbrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "/Users/administrator/Downloads/chromedriver");

		 driver = new ChromeDriver();
	 }
	 
	
	@Test(dataProviderClass = search_data.class, dataProvider = "roundtripsearch")
	public void search(String origin_airport,String destination_airport,String date,String time,String passanger,String returndate,String returntime) throws InterruptedException, AWTException
	{  
	 
	  
	  driver.get("https://jetsetter:Jetsavvy!@demo.jetsavvy.com/home");
	  
	  
	  
	  Thread.sleep(2000);
	  
	  
	//  Dimension d = new Dimension(1200,1200);
	  
	  driver.manage().window().maximize();
	  
	//  application_page.search(driver).click();
	 // Thread.sleep(4000);
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  search_page.roundtrip(driver).click();
	
	  Thread.sleep(2000);
	  search_page.origin(driver, origin_airport);
	  
	  
	  search_page.destination(driver, destination_airport);
	  
	  
	  search_page.date(driver, date);
	  
	  
	
     search_page.time(driver, time);
     
	 // search_page.submit(driver).click();
     search_page.passanger(driver).clear();
	  
     search_page.passanger(driver).sendKeys(passanger);
    
     
	  
	  search_page.returndate(driver, returndate);
	  
	
    search_page.returntime(driver, returntime);
    Thread.sleep(2000);
     
     search_page.submit(driver).click();
     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
     
try {
		  
		  if (search_result_page.aircrafttype(driver).isDisplayed())
		  {
			  System.out.println("Search result page display---Test Pass-- " );
			  search_result_page.aircraftlist(driver);		  
			  
		  }
		  System.out.println("Total search result)"+search_result_page.totalsearchresult(driver).getText());
	  }
	  
	  catch(Exception e)
	  {
		  
	  Assert.fail("search result not display");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  }
	 // Thread.sleep(4000);
	//  search_page.date(driver).sendKeys(date);
	  
	 // search_page.date(driver).sendKeys(date);
	  
	
	  
	}
	
	@AfterTest()
	public void browserclose()
	{
		driver.quit();
	}

}
