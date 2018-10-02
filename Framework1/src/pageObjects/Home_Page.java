package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class Home_Page {
	
	private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement lnk_MyAccount(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		
		
		
		 
	    element = driver.findElement(By.cssSelector("span.gb_ab.gbii"));;
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    Log.info(" my account button located");
	    return element;
	 
	    }
	
	public static WebElement lnk_LogOut(WebDriver driver){
		wait =new WebDriverWait(driver,15);
	    element = driver.findElement(By.xpath(".//*[@id='gb_71']"));
	    wait.until(ExpectedConditions.visibilityOf(element));
	    Log.info("logout button located");
	 
	 return element;
	 
	    }
	
	
}
