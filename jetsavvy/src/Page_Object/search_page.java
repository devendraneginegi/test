package Page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search_page {

	
	//  //*[(@id='mat-input-22')]
	
private static WebElement element = null;
private static WebElement element1 = null;
static Select sel;
	
	public static WebDriverWait wait;
	
	
public static void destination(WebDriver driver,String airport) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[(@placeholder='Destination')]"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    
	    element.sendKeys(airport);
	    
	    Thread.sleep(4000);
	    
	    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='inner-airport']"));

	    for(WebElement option : optionsToSelect){
	        System.out.println(option.getText());
	        if(option.getText().equals("CHHATRAPATI SHIVAJI INTL")) {
	            System.out.println("Trying to select: "+airport);
	            System.out.println(" ");
	            Thread.sleep(3000);
	            option.click();
	            break;
	        }
	    
	  //  return element;
	 
	    }
}

public static void date(WebDriver driver, String date) throws InterruptedException{
	
	wait =new WebDriverWait(driver,25);
	
	
	// //*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']
	
	// //*[@role='gridcell']
	element = driver.findElement(By.xpath("//*[@class='mat-datepicker-toggle']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    
    element.click();
    
    Thread.sleep(4000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-calendar-body-cell-content']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(date)) {
            System.out.println("Trying to select: "+date);
            System.out.println(" ");
            Thread.sleep(3000);
            option.click();
            break;
        }
    
  //  return element;
 
    }
    }
public static WebElement passanger(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@type='number']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }

public static void time(WebDriver driver,String time) throws InterruptedException{
	
	// //*[@id='mat-select-1']
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']"));
     
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    
    Thread.sleep(4000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));
   

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals("01:00 AM")) {
            System.out.println("Trying to select: "+time);
            System.out.println(" ");
            Thread.sleep(3000);
            option.click();
            break;
        }
    
    }
 
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
        System.out.println(option.getText());
        if(option.getText().equals("INDIANAPOLIS INTL")) {
            System.out.println("Trying to select: "+airport);
            System.out.println(" ");
            Thread.sleep(3000);
            option.click();
            break;
        }
    
    }
	
  }



public static WebElement submit(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@type='submit']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }


//  //*[@id='mat-input-5']



}
