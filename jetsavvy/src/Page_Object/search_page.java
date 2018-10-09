package Page_Object;

import java.util.List;

import org.openqa.selenium.Alert;
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
	    
	    Thread.sleep(1000);
	    
	    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='inner-airport']"));

	    for(WebElement option : optionsToSelect){
	        System.out.println(option.getText());
	        if(option.getText().equals(airport)) {
	            System.out.println("Trying to select: "+airport);
	            System.out.println(" ");
	            Thread.sleep(1000);
	            option.click();
	            break;
	        }
	    
	  //  return element;
	 
	    }
}

public static void date(WebDriver driver, String date) throws InterruptedException{
	
	
	
	wait =new WebDriverWait(driver,15);
	System.out.println(date);
	
	// //*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']
	
	// //*[@role='gridcell']
	element = driver.findElement(By.xpath("//*[@class='mat-datepicker-toggle']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    
    element.click();
    
    Thread.sleep(1000);
    
    element1 = driver.findElement(By.xpath("//*[@aria-label='"+date+"']"));

    element1.click();
  //  return element;
 
   
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
    Thread.sleep(1000);
  
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));
    
    
    
    Thread.sleep(1000);
    
  //  List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@role='option']"));
   

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(time)) {
            System.out.println("Trying to select: "+time);
            System.out.println(" ");
            Thread.sleep(1000);
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
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='inner-airport']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(airport)) {
            System.out.println("Trying to select: "+airport);
            System.out.println(" ");
            Thread.sleep(1000);
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


//  //*[@class='mat-radio-container']//following::div[4]

public static WebElement roundtrip(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-radio-container']//following::div[4]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }

public static WebElement multitrip(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-radio-container']//following::div[9]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }



public static void returndate(WebDriver driver,String date) throws InterruptedException{
	
wait =new WebDriverWait(driver,15);
	
	
	// //*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']
	
	// //*[@role='gridcell']
	element = driver.findElement(By.xpath("//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']//following::div[32]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    
    element.click();
    
    Thread.sleep(1000);
    
    element1 = driver.findElement(By.xpath("//*[@aria-label='"+date+"']"));

     element1.click();
 
    }

public static void returntime(WebDriver driver,String time) throws InterruptedException{
	
	// //*[@class='mat-select-value']//following::div[32]
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[32]"));
    
     
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));
    
    
    
    Thread.sleep(2000);
    
  //  List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@role='option']"));
   

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(time)) {
            System.out.println("Trying to select: "+time);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
       }

     }
public static WebElement mutitrip(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-radio-container']//following::div[9]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }

public static void origin1(WebDriver driver, String airport) throws InterruptedException {
	// TODO Auto-generated method stub
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[(@placeholder='Origin')]//following::input[4]"));
    
    
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.sendKeys(airport);
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='inner-airport']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(airport)) {
            System.out.println("Trying to select: "+airport);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
    }
	
  }

public static void destination1(WebDriver driver,String airport) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[(@placeholder='Destination') and (@id='mat-input-7') ]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    
    element.sendKeys(airport);
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='inner-airport']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(airport)) {
            System.out.println("Trying to select: "+airport);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
  //  return element;
 
    }
}

public static void date1(WebDriver driver,String date) throws InterruptedException{
	
wait =new WebDriverWait(driver,15);
	
	
	// //*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']
	
	// //*[@role='gridcell']
	element = driver.findElement(By.xpath("//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']//following::div[55]"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    
    element.click();
    
    Thread.sleep(1000);
    
    element1 = driver.findElement(By.xpath("//*[@aria-label='"+date+"']"));

     element1.click();
 
    }

public static void time1(WebDriver driver,String time) throws InterruptedException{
	
	// //*[@id='mat-select-1']
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[55]"));
    
     
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    Thread.sleep(1000);
  
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));
    
    
    
    Thread.sleep(1000);
    
  //  List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@role='option']"));
   

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(time)) {
            System.out.println("Trying to select: "+time);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
    }
 
    }

public static WebElement passanger1(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@id='mat-input-5']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
 
    }

}
