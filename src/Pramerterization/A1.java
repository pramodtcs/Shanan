
package Pramerterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException    {
		
		FileInputStream file = new FileInputStream("‪D:\\Pramod patil  17sep\\Book1.xlsx");
		
		 String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		 
		
		 System.out.println(data);
		
	}
		
	

}

