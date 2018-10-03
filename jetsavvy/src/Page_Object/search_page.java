package Page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search_page {

	
	//  //*[(@id='mat-input-22')]
	
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	
public static void destination(WebDriver driver,String airport) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[(@placeholder='Destination')]"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    
	    element.sendKeys(airport);
	    
	    Thread.sleep(4000);
	    
	    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='inner-airport']"));

	    for(WebElement option : optionsToSelect){
	        System.out.println(option);
	        if(option.getText().equals("INDIANAPOLIS INTL")) {
	            System.out.println("Trying to select: "+airport);
	            option.click();
	            break;
	        }
	    
	  //  return element;
	 
	    }
}

public static WebElement date(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	// //*[(@class='ng-star-inserted')]
	 
    element = driver.findElement(By.xpath("//*[(@class='ng-star-inserted')]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }
public static WebElement passanger(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[(@id='mat-input-21')]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }

public static WebElement time(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[(@class='mat-select-value')]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }
public static void origin(WebDriver driver, String airport) throws InterruptedException {
	// TODO Auto-generated method stub
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[(@placeholder='Origin')]"));
    
    
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.sendKeys(airport);
    
    Thread.sleep(4000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='inner-airport']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option);
        if(option.getText().equals("INDIANAPOLIS INTL")) {
            System.out.println("Trying to select: "+airport);
            option.click();
            break;
        }
    
    }
	
}
}
