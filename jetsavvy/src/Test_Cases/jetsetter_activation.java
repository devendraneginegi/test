package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Gmail_pom.gmail_homepage;
import Gmail_pom.gmail_loginpage;
import Page_Object.application_page;
import Page_Object.registration_confirm;
import Page_Object.signup_page;
import Page_Object.welcome_page;
import Testdata.jetsetter_signup_data;


public class jetsetter_activation {


	WebDriver driver;
	 
	 
	 @BeforeTest()
	 public void openbrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "/Users/administrator/Downloads/chromedriver");

		 driver = new ChromeDriver();
	 }
	
	@Test(dataProviderClass = jetsetter_signup_data.class, dataProvider = "jetsettersignup")
	public void signup(String fname,String lname,String email,String password) throws InterruptedException
	{  	 
	  
	  driver.get("https://jetsetter:Jetsavvy!@demo.jetsavvy.com/home");	  
	  //Thread.sleep(2000);
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  application_page.jetsetter(driver).click();
	  //Thread.sleep(4000);
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  welcome_page.signup(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  signup_page.firstname(driver).sendKeys(fname);
	  
	  signup_page.lastname(driver).sendKeys(lname);
	  
	  signup_page.email(driver).sendKeys(email);
	  
	  signup_page.password(driver).sendKeys(password);
	  
	  signup_page.signup(driver).click();
	  
	  Thread.sleep(2000);
	  
	  driver.get("https://www.gmail.com");
	  
	  gmail_loginpage.id(driver).sendKeys("devendra.singh@quadrateglobal.com");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  gmail_loginpage.next(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  gmail_loginpage.password(driver).sendKeys("Deepak@123");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  gmail_loginpage.next(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  String win= driver.getWindowHandle();
	  
	  driver.switchTo().window(win);
	  
	  gmail_homepage.closealert(driver).click();
	    
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  gmail_homepage.selectactivationmail(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  gmail_homepage.clickonactivation(driver).click();
	  
	
	  
	  
	  

	  
	}
	
	 @AfterTest()
	 public void closebrowser()
	 {
		// driver.quit();
	 }
}
