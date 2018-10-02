package test_case;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import junit.framework.Assert;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.Log;
import appModule.SignIn_Action;
import appModule.SignIn_Action_testng;


public class read_write_testng
{
	
	
	
	XSSFSheet sheet;
	 
	XSSFWorkbook wb;
	FileInputStream fis;
	FileOutputStream fos;

	

	XSSFRow row;
	WebDriver driver = null;
	
	private static String s;
@BeforeClass
public void open()
{
	
	
	DOMConfigurator.configure("log4j.xml");
	 
	Log.startTestCase("Selenium_Test_001");
	

	
	
}



@Test
public void start()
{

    try {
        // Open the Excel file
        fis = new FileInputStream("D://Selenium program//Framework1//src//testData//TestData.xlsx");
        
       
        
        
        // Access the required test data sheet
         wb = new XSSFWorkbook(fis);
         sheet = wb.getSheet("Sheet1");
        // Loop through all rows in the sheet
        // Start at row 1 as row 0 is our header row
        for(int count = 1;count<=sheet.getLastRowNum();count++){
        	
        	 
        	
        	
             row = sheet.getRow(count);
            System.out.println("Running test case " + row.getCell(0).toString());
            // Run the test for the current test data row
            s= SignIn_Action_testng.Execute(driver ,row.getCell(1).toString(),row.getCell(2).toString());
           
           System.out.println(s);
           
           row.createCell(3).setCellValue(s);
           
        //   Assert.assertEquals("not login", "Pass", s);

           

        }
        
        
        fos = new FileOutputStream("D://Selenium program//Framework1//src//testData//TestData.xlsx");
    	
        wb.write(fos);
        fis.close();
        fos.close();
        
        
        
    }
    
    
    catch (IOException e) {
        System.out.println("Test data file not found");
    }   

    
    
}

@AfterClass
public void end()
{
    System.out.println("test end");

}


}