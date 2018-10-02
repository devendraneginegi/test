package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import appModule.SignIn_Action;

public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	
	//public static String resul=null;
	
	public static WebDriver driver;

//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file

		FileInputStream ExcelFile = new FileInputStream(Path);
		
		FileOutputStream fileOut = new FileOutputStream(Path);


		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		
		for(int count = 1;count<=ExcelWSheet.getLastRowNum();count++){
            XSSFRow row = ExcelWSheet.getRow(count);
            System.out.println("Running test case " + row.getCell(0).toString());
            // Run the test for the current test data row
   //         String resul= SignIn_Action.Execute(driver ,row.getCell(1).toString(),row.getCell(2).toString());
            
         //   row.createCell(3).setCellValue(resul);
        }
		

//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num



//This method is to write in the Excel cell, Row num and Col num are the parameters





// Constant variables Test Data path and Test Data file name


				ExcelWBook.write(fileOut);
				ExcelFile.close();

				//fileOut.flush();

				fileOut.close();

			}catch(Exception e){

				throw (e);

		}

	}



}
