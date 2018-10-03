package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signup_page {
	
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
public static WebElement firstname(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	 
	    }
public static WebElement lastname(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }

public static WebElement email(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Email Address']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }

public static WebElement password(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Password']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }

public static WebElement signup(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@value='Sign Up']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }

}
