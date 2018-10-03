package Page_Object;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search_result_page {
	
private static WebElement element = null;
	
	public static WebDriverWait wait;
	
public static WebElement aircrafttype(WebDriver driver) throws InterruptedException{
		
		wait =new WebDriverWait(driver,15);
		 
	    element = driver.findElement(By.xpath("//*[@class='aircraft-type']"));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	    
	    return element;
	 
	    }

public static void aircraftlist(WebDriver driver) throws InterruptedException{
	
	// //*[@id='mat-select-1']
	
	wait =new WebDriverWait(driver,15);   
    
    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@class='aircraft-type']"));
   
      int total= optionsToSelect.size();
      System.out.println("Total aircraft in current page is- " +total);
      for(WebElement option : optionsToSelect){
    	
        System.out.println("Aircraft name--"+option.getText());
       
    
    }
 
    }



public static WebElement totalsearchresult(WebDriver driver) {
	wait =new WebDriverWait(driver,15);
	 
    element = driver.findElement(By.xpath("//*[@class='search-result-head ng-star-inserted']"));
    
    wait.until(ExpectedConditions.visibilityOf(element));
    
    return element;
}

}
