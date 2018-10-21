package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.registration_confirm;
import Page_Object.signup_page;
import Page_Object.welcome_page;
import Testdata.jetoperator_signup_data;


public class jetoperator_signup {
	
	WebDriver driver;
	 
	 
	 @BeforeTest()
	 public void openbrowser()
	 {

		 String path = System.getProperty("user.dir");
			
		 System.out.println(path);
		 
		 System.setProperty("webdriver.chrome.driver", path+"/src/Browser/chromedriver.exe");

		 driver = new ChromeDriver();
	 }
	
	@Test(dataProviderClass = jetoperator_signup_data.class, dataProvider = "jetoperator_signup")
	public void signup(String fname,String lname,String email,String password) throws InterruptedException
	{  	 
	  
	  driver.get("https://jetsetter:Jetsavvy!@demob2b.jetsavvy.com/welcome/JMCO");	  
	  //Thread.sleep(2000);
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  welcome_page.signup(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  signup_page.firstname(driver).sendKeys(fname);
	  
	  signup_page.lastname(driver).sendKeys(lname);
	  
	  signup_page.email(driver).sendKeys(email);
	  
	  signup_page.password(driver).sendKeys(password);
	  
	  signup_page.signup(driver).click();
	  
	  Thread.sleep(4000);
try {
		  
		  if (registration_confirm.registration(driver).isDisplayed())
		  {
			  System.out.println("user is reristered check mail for activation.Test Case  PASS"+ fname +" and password "+ "*****");
			  
		  }
		  
	  }
	  
	  catch(Exception e)
	  {
		  
		  Assert.fail("Test case fail", e);
	 
	  }  
	  
	}
	@AfterTest()
	 public void closebrowser()
	 {
		 driver.quit();
	 }

}
