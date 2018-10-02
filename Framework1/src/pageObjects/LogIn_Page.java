package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class LogIn_Page {

	
	//public static WebDriver driver = null;
	
	private static WebElement element = null;
	
	public static WebDriverWait wait;
	 
    public static WebElement txtbx_UserName(WebDriver driver){
 
    	wait =new WebDriverWait(driver,15);
    	
         element = driver.findElement(By.xpath(".//*[@id='identifierId']"));
         wait.until(ExpectedConditions.visibilityOf(element));
         Log.info(" Email text box located");

         return element;
 
         }
    
    public static WebElement click_next(WebDriver driver){
    	
    	wait =new WebDriverWait(driver,15);
    	 
        element = driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]"));
        wait.until(ExpectedConditions.visibilityOf(element));
        Log.info(" next button located");

    

        return element;

        }
 
     public static WebElement txtbx_Password(WebDriver driver){
    	 
    	 wait =new WebDriverWait(driver,15);
 
         element = driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
         
         wait.until(ExpectedConditions.visibilityOf(element));
         Log.info(" Password text box located");

      
 
         return element;
 
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
    	 
    	 wait =new WebDriverWait(driver,15);
 
         element = driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span"));
         
         wait.until(ExpectedConditions.visibilityOf(element));
         
         Log.info(" login button located");

 
         return element;
 
         }
}
