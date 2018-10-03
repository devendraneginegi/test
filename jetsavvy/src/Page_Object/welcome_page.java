package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class welcome_page {
	
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement signup(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[text()='SignUp']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	 
	    }

	public static WebElement loginlink(WebDriver driver) {
		// TODO Auto-generated method stub
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@class='mat-button-wrapper']//following::span[4]"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
		
	}
	
	// 

}
