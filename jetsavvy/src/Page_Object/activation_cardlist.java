package Page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activation_cardlist {

private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement addcard(WebDriver driver) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		Thread.sleep(2000);
		 
	    element = driver.findElement(By.xpath("//*[@class='btn btn-full-width btn-border btn-primary mat-button']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
public static void cardtype(WebDriver driver,String month) throws InterruptedException{
		
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']"));
    
    
    
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

public static void month(WebDriver driver,String day) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[19]"));
    
    
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(day)) {
            System.out.println("Trying to select: "+day);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
    }
	
	}
public static void year(WebDriver driver,String year) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[32]"));
    
    
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(year)) {
            System.out.println("Trying to select: "+year);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
    }
	
	}
public static void country(WebDriver driver,String gender) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[81]"));
    
    
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(gender)) {
            System.out.println("Trying to select: "+gender);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
    }
	
	}
public static void state(WebDriver driver,String state) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[92]"));
    
    
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(state)) {
            System.out.println("Trying to select: "+state);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
    }
	
	}

public static WebElement cardnumber(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Card Number']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement postal(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Postalcode']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}


public static WebElement save(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@type='submit']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}

public static WebElement next(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@type='submit']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement securitycode(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@type='password']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement nameoncard(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Name On Card']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement address1(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Address Line 1']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement address2(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Address Line 2']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
public static WebElement city(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='City']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
}
