package appModule;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import pageObjects.LogIn_Page;
import utility.Constant;
import utility.Log;

public class settingpage {

	
	public static String check(WebDriver driver,String exp)
	
	{
		String sValue = null;
		 System.setProperty("webdriver.chrome.driver", "D://Chrome driver//chromedriver.exe");

			

		 driver = new ChromeDriver();

			

			
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			

			driver.get(Constant.URL);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
			
			
		
			
			
			
			LogIn_Page.txtbx_UserName(driver).sendKeys(Constant.Username);
	         Log.info("Enter user name");
	         
	         //driver.manage().window().maximize();

			LogIn_Page.click_next(driver).click();
			
	         Log.info(" press next button");


			LogIn_Page.txtbx_Password(driver).sendKeys("deepak1122");
	         Log.info(" enter password");

			LogIn_Page.btn_LogIn(driver).click();
			
	         Log.info(" press login button");
			
			
	         WebElement ele1= driver.findElement(By.xpath(".//*[@id=':28']"));
	         
	           ele1.click();
	           
	           WebElement ele2= driver.findElement(By.xpath(".//*[@id='ms']/div"));
	           
	           ele2.click();
	        //   WebElement ele3= driver.findElement(By.xpath(".//*[@id=':ls']"));

	           Select sel=new Select(driver.findElement(By.id(".//*[@id=':ls']")));
	           	
	   		List<WebElement> oSize = sel.getOptions();

	   		
			int iListSize = oSize.size();
			
			
			for(int i =0; i < iListSize ; i++){
				// Storing the value of the option	
				 sValue = sel.getOptions().get(i).getText();
				// Printing the stored value
				System.out.println(sValue);
				// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
				if(sValue.equals(exp)){
					sel.selectByIndex(i);
					break;
					}
				}
			return sValue;	 
	           
	           
			
	           

	}
}
