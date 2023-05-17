package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1. Converting the physical representation of excel sheet into java representation
		FileInputStream fis = new FileInputStream("./testData/ExcelData.xlsx");
		//2. Reading the java representation of Workbook or accessing the workbook
		Workbook workbook = WorkbookFactory.create(fis);
		//3. accessing the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		//4. accessing the row
		Row row = sheet.getRow(2);
		//5. accessing the cell
		Cell cell = row.getCell(0);
		//6. Converting cell type to string type
		String customer2 = cell.getStringCellValue();
		//printing the data into the console
		System.out.println("The 2nd Customer is : "+customer2);
		
		Cell cell1= row.getCell(1);
		long customer2PhoneNo = (long)cell1.getNumericCellValue();
		System.out.println(customer2PhoneNo);
		
		boolean statusOfCustomer2 = row.getCell(3).getBooleanCellValue();
		if(statusOfCustomer2) {
			System.out.println("Proceed");
		}
		
		else
			System.out.println("Don't proceed");
		
		
	}

}
