package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//it is use to store generic reusable method....
	//all methods are non static
	
	//It is use  to read the data from ExcelSHeet
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(rowCount);
		String data = cell.getStringCellValue();
		return data;
	}
	
	// it is use to get last count of row where we store data
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//provide the path of the file
		Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}
		
	//it is use to write the data into excel sheet
		public void writeExcelData(String exceLPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream(exceLPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);//get into sheet
			Row row = sheet.getRow(rowCount);//pass the row count
			Cell cell = row.createCell(cellCount);//pass the cell count
			cell.setCellValue(data);//pass the string argument as data
			FileOutputStream fos = new FileOutputStream(exceLPath);
			wb.write(fos);
			
		
		
		
	}

}
