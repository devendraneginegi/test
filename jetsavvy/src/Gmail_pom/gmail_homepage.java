package Gmail_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail_homepage {
	private static WebElement element = null;
	
public static WebDriverWait wait;
	
	public static WebElement selectactivationmail(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//span[text()='JetSavvy User Activation']//following::span[6]"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
	

	
	public static WebElement clickonactivation(WebDriver driver) throws InterruptedException{
		
		wait =new WebDriverWait(driver,25);
		Thread.sleep(3000);
		 
	    element = driver.findElement(By.xpath("//a[contains(@data-saferedirecturl,'https://demo.jetsavvy.com')]"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
	
	////*[@class='bBe']
	
public static WebElement closealert(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@class='bBe']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
	

}
