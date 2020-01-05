package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File f =new File("./data/input.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet("Sheet1").getRow(1).getCell(0);
		System.out.println(c);
		Cell c1 = wb.getSheet("Sheet1").getRow(1).getCell(1);
		
		DataFormatter d = new DataFormatter();
	//	String data = d.formatCellValue(c);
	//	System.out.println(data);
		String data1 = d.formatCellValue(c1);
		System.out.println(data1);
		
		
	}
}