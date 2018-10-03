package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home_page {
	
	
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement logout(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
	
	// //*[contains(text(),'Logout')]//following::span[]
	
public static WebElement dashboard(WebDriver driver){
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[contains(text(),'Logout')]//following::span[1]"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}

public static WebElement cardlist(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[contains(text(),'Logout')]//following::span[2]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}

}
