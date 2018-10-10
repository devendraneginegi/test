package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registration_confirm {
	
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	

	public static WebElement registration(WebDriver driver) {
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[text()='Email confirmation']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}

}
