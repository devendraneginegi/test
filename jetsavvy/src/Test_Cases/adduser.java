package Test_Cases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.application_menu;
import Page_Object.application_page;
import Page_Object.home_page;
import Page_Object.login_page;
import Page_Object.welcome_page;
import Testdata.adduser_data;
import Testdata.login_data;

public class adduser {
	

	 private WebDriver driver;
	 
	 
	 @BeforeTest()
	 public void openbrowser()
	 {
		 

		 String path = System.getProperty("user.dir");
			
		 System.out.println(path);
		 
		 System.setProperty("webdriver.chrome.driver", path+"/src/Browser/chromedriver.exe");

		 driver = new ChromeDriver();
		
	 }
	
	@Test(dataProviderClass = login_data.class, dataProvider = "loginjetsetter", priority=1)
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
	  
	  
	}
	
	@Test(dataProviderClass = adduser_data.class, dataProvider = "adduser",priority=2)
	public void adduser1(String usertype,String fname,String lname,String emailid,String password, String phone) throws InterruptedException
	{ 
      application_menu.manageuser(driver).click();
	  application_menu.adduser(driver).click();
	//  String win= driver.getWindowHandle();  
	//  driver.switchTo().window(win);
	    Thread.sleep(2000);
	  application_menu.addusertype(driver, usertype);
	  application_menu.firstname(driver).sendKeys(fname);
	  application_menu.lastname(driver).sendKeys(lname);
	  application_menu.email(driver).sendKeys(emailid);
	  application_menu.password(driver).sendKeys(password);
	  application_menu.phonenumber(driver).sendKeys(phone);
	  application_menu.save(driver).click();
		
	}
	
	
	
	@AfterTest()
	public void browserclose()
	{
	//	driver.quit();
	}


}
