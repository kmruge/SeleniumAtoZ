package DataWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDataWrite {
	@Test
	void data() throws IOException
	{
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Muru");
		XSSFSheet sheet1=book.createSheet("Muru1");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("come");
		
		File location=new File("C:\\Users\\kmruge\\eclipse-workspace\\SeleniumAtoZ\\src\\main\\java\\DataWrite\\dataWrite.xlsx");
		FileOutputStream out=new FileOutputStream(location);
		book.write(out);
		book.close();
	}
}