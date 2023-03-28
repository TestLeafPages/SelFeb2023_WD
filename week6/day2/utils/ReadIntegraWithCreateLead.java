package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadIntegraWithCreateLead {

	public static String[][] readData(String datafile) throws IOException {
	XSSFWorkbook wb= new XSSFWorkbook("./data/"+datafile+".xlsx");	
	
	//step2
	XSSFSheet sheet = wb.getSheetAt(0);
		
		//step3
	int rowNum = sheet.getLastRowNum();
		
		//step 4
	int cellNum = sheet.getRow(0).getLastCellNum();
	
	//converting into dataprovider
	
	String[][] data= new String[rowNum][cellNum];
	
	for (int i = 1; i <=rowNum; i++) {
		XSSFRow row = sheet.getRow(i);
		
		for (int j = 0; j < cellNum; j++) {
			XSSFCell cell = row.getCell(j);
		
			data[i-1][j]=cell.getStringCellValue();
			//data[0][0]=testleaf
			System.out.println(" "+cell.getStringCellValue()+" ");
		}
	}
	//step 5
	wb.close();
	return data;
	
	}	
	
}
