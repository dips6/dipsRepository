package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
	for(int i=1;i<=10;i++)
	{
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis); //make the file ready for read
		Sheet sheet = wb.getSheet("IPL"); //get into sheet
		Row row = sheet.getRow(1); //get into desired row
		Cell cell = row.getCell(0); //get into desired cell/col
		String data = cell.getStringCellValue(); //get the value from cell/col
		Thread.sleep(2000);
	    System.out.println("data");
	}
	}
}
	
	//generalize the row count
	//FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
	//wb2=WorkbookFactory.create(fis2);
	//sheet2=wb2.getSheet("IPL");
	//row=sheet.getRow(1);
	//cell=row.getCell(0);
	//data=cell.getStringCellValue();
	//Thread.sleep(2000);
	//System.out.println(data);

	
	
	

	


