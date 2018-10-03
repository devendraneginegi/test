package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.application_page;
import Page_Object.home_page;
import Page_Object.login_page;
import Page_Object.welcome_page;
import Testdata.login_data;

public class jetoperator_login_test {
	
	WebDriver driver;
	 
	 
	 @BeforeTest()
	 public void openbrowser()
	 {
		 
		 String path = System.getProperty("user.dir");
		
		 System.out.println(path);
		 
		 System.setProperty("webdriver.chrome.driver", path+"/src/Browser/chromedriver");

		 driver = new ChromeDriver();
		 
		
	 }
	
	@Test(dataProviderClass = login_data.class, dataProvider = "loginjetoperator")
	public void login(String username,String password) throws InterruptedException
	{  	 
	  
	  driver.get("https://jetsetter:Jetsavvy!@demob2b.jetsavvy.com/home");	  
	  Thread.sleep(2000);
	  
	  driver.manage().window().maximize();
	  
	  application_page.broker(driver).click();
	  Thread.sleep(4000);
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  welcome_page.loginlink(driver).click();
	  Thread.sleep(4000);
	  
	  login_page.id(driver).sendKeys(username);
	  Thread.sleep(4000);
	  
	  login_page.password(driver).sendKeys(password);
	  Thread.sleep(4000);
	  
	  login_page.login(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  Thread.sleep(4000);
	  
	  try {
		  
		  if (home_page.logout(driver).isDisplayed())
		  {
			  home_page.logout(driver).click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
		  }
	  }
	  
	  catch(Exception e)
	  {
		  
	  Assert.fail("Login Fail for username "+ username +" and password "+ "*****");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  }
	  
	}
	
	
	
	@AfterTest()
	public void browserclose()
	{
		driver.quit();
	}



}
