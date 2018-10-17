package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activation_termscondition {
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement accept(WebDriver driver) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		Thread.sleep(2000);
		 
	    element = driver.findElement(By.xpath("//*[text()='ACCEPT THE TERMS']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
public static WebElement finish(WebDriver driver) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		Thread.sleep(2000);
		 
	    element = driver.findElement(By.xpath("//*[text()='Finish']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
}
