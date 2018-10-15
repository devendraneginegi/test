package Gmail_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail_loginpage {
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement id(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@aria-label='Email or phone']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}

public static WebElement next(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[text()='Next']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
	
public static WebElement password(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@aria-label='Enter your password']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}

}
