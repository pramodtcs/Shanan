package Pramerterization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

//numeric type data fetcing
public class B {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("D:\\Pramod patil  17sep\\Book1.xlsx");
	double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(data);
}
	

}