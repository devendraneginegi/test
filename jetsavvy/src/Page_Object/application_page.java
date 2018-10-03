package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class application_page {
	
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement jetsetter(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@href='/welcome/JETS']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
	
public static WebElement search(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[contains(text(),'Search')]"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}

public static WebElement broker(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='ng-star-inserted']//following::span[1]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}

public static WebElement jetowner(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='ng-star-inserted']//following::span[2]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}

public static WebElement jetoperator(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='ng-star-inserted']//following::span[3]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
//  //*[@class='ng-star-inserted']//following::span[1]

}
