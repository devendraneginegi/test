package Page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class application_menu {
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement manageuser(WebDriver driver) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		Thread.sleep(2000);
		 
	    element = driver.findElement(By.xpath("//*[text()='Manage Users']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}

	
	public static void addusertype(WebDriver driver,String month) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@class='mat-select-placeholder ng-tns-c17-16 ng-star-inserted']"));
	        
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    element.click();
	    
	    Thread.sleep(1000);
	    
	    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));

	    for(WebElement option : optionsToSelect){
	        System.out.println(option.getText());
	        if(option.getText().equals(month)) {
	            System.out.println("Trying to select: "+month);
	            System.out.println(" ");
	            Thread.sleep(1000);
	            option.click();
	            break;
	        }
	    
	    }
		
		}
public static WebElement adduser(WebDriver driver) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		Thread.sleep(2000);
		 
	    element = driver.findElement(By.xpath("//*[@class='btn btn-full-width btn-border btn-primary mat-button']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}

public static WebElement firstname(WebDriver driver) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	Thread.sleep(2000);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='First Name']//following::input[4]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement lastname(WebDriver driver) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	Thread.sleep(2000);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='First Name']//following::input[5]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement email(WebDriver driver) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	Thread.sleep(2000);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='First Name']//following::input[6]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement password(WebDriver driver) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	Thread.sleep(2000);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Password']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement phonenumber(WebDriver driver) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	Thread.sleep(2000);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='First Name']//following::input[8]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement save(WebDriver driver) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	Thread.sleep(2000);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-button-wrapper']//following::button[6]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
}
