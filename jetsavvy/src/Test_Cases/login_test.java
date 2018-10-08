package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.application_page;
import Page_Object.home_page;
import Page_Object.login_page;
import Page_Object.search_page;
import Page_Object.welcome_page;
import Testdata.login_data;


public class login_test {
	
	
	 WebDriver driver;
	 
	 
	 @BeforeTest()
	 public void openbrowser()
	 {
		 
		 String path = System.getProperty("user.dir");
		
		 System.out.println(path);
		 
		 System.setProperty("webdriver.chrome.driver", path+"/src/Browser/chromedriver");

		 driver = new ChromeDriver();
		 
		
	 }
	
	@Test(dataProviderClass = login_data.class, dataProvider = "loginjetsetter")
	public void login(String username,String password) throws InterruptedException
	{  	 
	  
	  driver.get("https://jetsetter:Jetsavvy!@demo.jetsavvy.com/home");	  
	  Thread.sleep(2000);
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  application_page.jetsetter(driver).click();
	  Thread.sleep(4000);
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  welcome_page.loginlink(driver).click();
	  
	  
	  login_page.id(driver).sendKeys(username);
	  
	  
	  login_page.password(driver).sendKeys(password);
	  
	  
	  login_page.login(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 
	  
	  try {
		  
		  if (home_page.logout(driver).isDisplayed())
		  {
			  System.out.println("user is redirecred to Home Page.Test Case  PASS"+ username +" and password "+ "*****");
			  home_page.logout(driver).click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
		  }
		  
	  }
	  
	  catch(Exception e)
	  {
		  
		  Assert.fail("Test case fail", e);
	 
	  }
	  
	}
	
	
	
	@AfterTest()
	public void browserclose()
	{
		driver.quit();
	}


}
