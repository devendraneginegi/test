package test_case;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import appModule.SignIn_Action;
import appModule.settingpage;

public class checkvalue {
	
	
	
	public static void main(String ar[])
	{
		
		
		XSSFSheet sheet;
		 
		XSSFWorkbook wb;
		FileInputStream fis;
		FileOutputStream fos;

		

		XSSFRow row;
		WebDriver driver = null;
	 
	    try {
	        // Open the Excel file
	        fis = new FileInputStream("D://File//Book1.xlsx");
	        
	       
	        
	        
	        // Access the required test data sheet
	         wb = new XSSFWorkbook(fis);
	         sheet = wb.getSheet("Sheet1");
	        // Loop through all rows in the sheet
	        // Start at row 1 as row 0 is our header row
	        for(int count = 1;count<=sheet.getLastRowNum();count++){
	        	
	        	 
	        	
	        	
	             row = sheet.getRow(count);
	            System.out.println("Running test case " + row.getCell(0).toString());
	            // Run the test for the current test data row
	           String s= settingpage.check(driver ,row.getCell(1).toString());
	           
	           System.out.println(s);
	           
	           row.createCell(3).setCellValue(s);
	           

	        }
	        
	        fos = new FileOutputStream("D://File//Book1.xlsx");
	    	
	        wb.write(fos);
	        fis.close();
	        fos.close();
	        
	        
	        
	    }
	    
	    
	    catch (IOException e) {
	        System.out.println("Test data file not found");
	    }   
	}

		
		
	}


