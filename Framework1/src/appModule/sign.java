package appModule;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;





public class sign {
	
	//public static WebDriver driver;
		public static String Execute(WebDriver driver,String sUserName, String sPassword){
			 
			//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
 
		// System.setProperty("webdriver.chrome.driver", "D://Chrome driver//chromedriver.exe");

		driver=browser.get_browser(driver,"chrome");

	//	 driver = new ChromeDriver();
			 

				Log.info("New driver instantiated");

				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				
			 driver.get(Constant.URL);
				

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Home_Page.lnk_MyAccount(driver).click();
 
			LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
	         Log.info("Enter user name");

			LogIn_Page.click_next(driver).click();
			
	         Log.info(" press next button");

 
				LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
	         Log.info(" enter password");

			LogIn_Page.btn_LogIn(driver).click();
			
	         Log.info(" press login button");
	         
	         
	        	 try
	        	 {
	        	 if(Home_Page.lnk_MyAccount(driver).isDisplayed()== true)
	        	 {
	        		
	        		 Home_Page.lnk_MyAccount(driver).click();
	        		    
	                Home_Page.lnk_LogOut(driver).click();
	                
	                
	        		Log.info("Click action is perfomred on Log Out link");
	        		

	        		
	        		
	        		

	                
	               System.out.println("----Test Case PASS  .----");
	                
	        		
	             }
	        	    driver.quit();
	        		return "Pass";
	        		

	        	 }
	        	 
	        	 catch(Exception e)
	        	 {
		                System.out.println("----Test Case FAIL.----");
		                
		                driver.quit();
		               return "Fail";
		               

	        	 }

	        	 
	        	
	          
	        	 }
		

       
        
 
        }
	        	 
		


