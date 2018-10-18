package Test_Cases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Gmail_pom.gmail_homepage;
import Gmail_pom.gmail_loginpage;
import Page_Object.activation_cardlist;
import Page_Object.activation_termscondition;
import Page_Object.activation_userprofile;
import Page_Object.application_page;
import Page_Object.registration_confirm;
import Page_Object.signup_page;
import Page_Object.welcome_page;
import Testdata.addcard_data;
import Testdata.jetsetter_signup_data;
import Testdata.userprofile_data;


public class jetsetter_activation {


	WebDriver driver;
	 
	 
	 @BeforeTest()
	 public void openbrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "/Users/administrator/Downloads/chromedriver");

		 driver = new ChromeDriver();
	 }
	 
	 @Test(dataProviderClass = jetsetter_signup_data.class, dataProvider = "jetsettersignup" , priority=1)
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
		  
		}
	 
	 
	 @Test(dataProviderClass = userprofile_data.class, dataProvider = "userprofile", priority=2 )
		public void userprofile(String month,String day,String year,String gender,String langugae,String airport,String currency,String phone) throws InterruptedException
		{  	 
		  
		  
		  driver.get("https://www.gmail.com");
		  
		  gmail_loginpage.id(driver).sendKeys("devendra.singh@quadrateglobal.com");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  gmail_loginpage.next(driver).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  gmail_loginpage.password(driver).sendKeys("Deepak@123");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  gmail_loginpage.next(driver).click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  
		  String win= driver.getWindowHandle();
		  
		  driver.switchTo().window(win);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Thread.sleep(4000);
		  
		  gmail_homepage.closealert(driver).click();
		  Thread.sleep(2000);
		    
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  
		  gmail_homepage.selectactivationmail(driver).click();
		  Thread.sleep(2000);
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  
		  gmail_homepage.clickonactivation(driver).click();
		  Thread.sleep(3000);
		  ArrayList tabs = new ArrayList (driver.getWindowHandles());
		    System.out.println(tabs.size());
		    driver.switchTo().window((String) tabs.get(1)); 
		    driver.switchTo().defaultContent();
		    Thread.sleep(2000);
		  activation_userprofile.next(driver).click();
		  Thread.sleep(2000);
		 
		  activation_userprofile.month(driver, month);
		  Thread.sleep(2000);
		  
		  activation_userprofile.day(driver, day);
		  Thread.sleep(2000);
		  
		  activation_userprofile.year(driver, year);
		  Thread.sleep(2000);
		  
		  activation_userprofile.gender(driver, gender);
		  Thread.sleep(2000);
		  
		  activation_userprofile.language(driver, langugae);
		  Thread.sleep(2000);
		  
		  activation_userprofile.phonenumber(driver).sendKeys(phone);
		  Thread.sleep(2000);
		  
		  activation_userprofile.airport(driver, airport);
		  Thread.sleep(2000);
		  
		  activation_userprofile.currency(driver, currency);
		  Thread.sleep(2000);
		  
		  activation_userprofile.next2(driver).click();
		  Thread.sleep(2000);
		  
		}
	
	
	@Test(dataProviderClass = addcard_data.class, dataProvider = "addcard", priority=3 )
	public void addcard(String cardtype,String cardnumber,String month,String year,String securitycode,String nameoncard,String address1,String address2,String country,String state, String city, String postal) throws InterruptedException
	{  	 
	 
	  
	  activation_cardlist.addcard(driver).click();
	  Thread.sleep(2000);
	  activation_cardlist.cardtype(driver, cardtype);
	  activation_cardlist.cardnumber(driver).sendKeys(cardnumber);
	  activation_cardlist.month(driver, month);
	  activation_cardlist.year(driver, year);
	  activation_cardlist.securitycode(driver).sendKeys(securitycode);
	  
	  activation_cardlist.nameoncard(driver).sendKeys(nameoncard);
	  
	  activation_cardlist.address1(driver).sendKeys(address1);
	  activation_cardlist.address2(driver).sendKeys(address2);
	
	  activation_cardlist.country(driver, country);
	  
	  activation_cardlist.state(driver, state);
	  
	  activation_cardlist.city(driver).sendKeys(city);
	  
	  activation_cardlist.postal(driver).sendKeys(postal);
	  
	  activation_cardlist.save(driver).click();
	  Thread.sleep(2000);
	  driver.switchTo().defaultContent();
	  Thread.sleep(2000);
	  
	  activation_cardlist.next(driver).click();
	  
	  activation_termscondition.accept(driver).click();
	  
	  activation_termscondition.finish(driver).click();
	  
	  Thread.sleep(2000);
	  
	  driver.switchTo().alert().accept();
	  

	  
	}
	
	 @AfterTest()
	 public void closebrowser()
	 {
		// driver.quit();
	 }
}
