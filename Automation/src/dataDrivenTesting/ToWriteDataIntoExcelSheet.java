package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// 1. Converting the physical representation of excel sheet into java representation
		FileInputStream fis = new FileInputStream("./testData/ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		sheet.createRow(4).createCell(0).setCellValue("Pankaj");
		
		FileOutputStream fos = new FileOutputStream("./testData/ExcelData.xlsx");
		workbook.write(fos);
		System.out.println("The workbook has been updated");
		workbook.close();
	}

}
