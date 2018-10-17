package Page_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activation_userprofile {
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
	public static WebElement next(WebDriver driver) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		Thread.sleep(2000);
		 
	    element = driver.findElement(By.xpath("//*[@class='mat-button-wrapper']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	}
public static void month(WebDriver driver,String month) throws InterruptedException{
		
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

public static void day(WebDriver driver,String day) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[11]"));
    
    
    
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
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[22]"));
    
    
    
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
public static void gender(WebDriver driver,String gender) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[33]"));
    
    
    
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
public static void language(WebDriver driver,String language) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[54]"));
    
    
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(language)) {
            System.out.println("Trying to select: "+language);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
    }
	
	}
public static void airport(WebDriver driver,String airport) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[75]"));
    
    
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));

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
public static void currency(WebDriver driver,String currency) throws InterruptedException{
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='mat-select-value']//following::div[86]"));
    
    
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    element.click();
    
    Thread.sleep(1000);
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='mat-option-text']"));

    for(WebElement option : optionsToSelect){
        System.out.println(option.getText());
        if(option.getText().equals(currency)) {
            System.out.println("Trying to select: "+currency);
            System.out.println(" ");
            Thread.sleep(1000);
            option.click();
            break;
        }
    
    }
	
	}
public static WebElement phonenumber(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@placeholder='Phone Number']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}

public static WebElement next2(WebDriver driver){
	
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@type='submit']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}
	
}
