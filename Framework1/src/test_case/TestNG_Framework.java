package test_case;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import utility.Log;
import appModule.SignIn_Action;




public class TestNG_Framework{

public static void main (String args[]) {
	WebDriver driver = null;
	
	DOMConfigurator.configure("log4j.xml");
	 
	Log.startTestCase("Selenium_Test_001");
 
    try {
        // Open the Excel file
        FileInputStream fis = new FileInputStream("D://File//TestData.xlsx");
        // Access the required test data sheet
        XSSFWorkbook wb = new XSSFWorkbook(fis); 
        XSSFSheet sheet = wb.getSheet("Sheet1");
        // Loop through all rows in the sheet
        // Start at row 1 as row 0 is our header row
        for(int count = 1;count<=sheet.getLastRowNum();count++){
            XSSFRow row = sheet.getRow(count);
            System.out.println("Running test case " + row.getCell(0).toString());
            // Run the test for the current test data row
           String s= SignIn_Action.Execute(driver ,row.getCell(1).toString(),row.getCell(2).toString());
           
           System.out.println(s);
           

        }
        
        
        fis.close();
    } catch (IOException e) {
        System.out.println("Test data file not found");
    }   
}
}