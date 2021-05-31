package testpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class FetchDataFromExcel {
	
	
	public void readData() throws IOException {
		
		
		String filepth = "C:\\Akshay\\test-automation\\Book.xlsx";
		
		
		File filename = new File(filepth);
		
		FileInputStream file = new FileInputStream(filename);
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
	    XSSFSheet sheet = wb.getSheet("Sheet1");
	    
	    
	 //   sheet.getRow(0);
	    System.out.println("first line ");
	    int rowc = sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println("row count "+ rowc);
		XSSFRow row=sheet.getRow(1);
	   
		XSSFRow newr = 	sheet.createRow(rowc+1);
	    
	//	System.out.println();
		
		for (int i=0;i<=row.getLastCellNum();i++) {
			
			//System.out.println("row count : " + i);
			

			XSSFCell cell = newr.createCell(i);
			cell.setCellValue("Newval");
		//	cell.setCellValue("another new val");
			
System.out.println("set the new value");

		//	System.out.println("value in the first row first col" + sheet.getRow(i).getCell(i));
			file.close();
			
			FileOutputStream fop = new FileOutputStream(filename);
			
			wb.write(fop);
			fop.close();
			
			
		}
	}
	

}
