package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcle {

	public static void main(String[] args) throws IOException {
		/*
		 * Steps to read from excel
		 * 
		 * 1) Open the workbook using file name and path 
		 * 2) Go to the specific sheet (bysheet name or index) 
		 * 3) Go to the specific row (by index) 
		 * 4) Go to the specific column (by index) -- cell 
		 * 5) Read the content
		 * 
		 * 1.I need to Create exclefile and i need save in under project Create new
		 * folder and paste file . step 1-----XSSFWorkBook step2------XSSFWoekSheet Step
		 * 3-----XSSFRow step 4-----XSSFCell
		 */

//Step1
	XSSFWorkbook wb= new XSSFWorkbook("./data/CreateLead.xlsx");	
		
	//step2
	XSSFSheet sheet = wb.getSheetAt(0);
		
		//step3
	int rowNum = sheet.getLastRowNum();
		
	System.out.println("total number rows : "+rowNum);
		
		//step 4
	int cellNum = sheet.getRow(0).getLastCellNum();
		
	System.out.println("total number cells : "+cellNum);
	
	//to print the data
//	XSSFRow row = sheet.getRow(2);
//	String stringCellValue = row.getCell(2).getStringCellValue();
//	System.out.println("my first data present  :"+stringCellValue);
	
	for (int i = 1; i <=rowNum; i++) {
		XSSFRow row = sheet.getRow(i);
		
		for (int j = 0; j < cellNum; j++) {
			XSSFCell cell = row.getCell(j);
			String data1 = cell.getStringCellValue();
			
			System.out.println(data1);
			
			
		}
	}
	//step 5
	wb.close();
	}

}
