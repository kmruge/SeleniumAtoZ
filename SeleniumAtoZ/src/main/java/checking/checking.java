package checking;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checking {
	WebDriver driver=null;
	@BeforeTest
	void run()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();                 
	}
	@Test(dataProvider="RepositoryName")
	void maa(String name)
	{
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(name);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
	}
	@DataProvider(name="RepositoryName")
	String[][] excel() throws IOException
	{
		String file_location="C:\\Users\\kmruge\\eclipse-workspace\\Github_new_POM\\File\\book.xlsx";
	    XSSFWorkbook book=new XSSFWorkbook(file_location);
		XSSFSheet sheet=book.getSheetAt(0);
		int rowNumber=sheet.getLastRowNum();
		int cellNumber=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[rowNumber+1][cellNumber];
		for(int i=0;i<=rowNumber;i++)
		{
			for(int j=0;j<cellNumber;j++)
			{
				XSSFRow row=sheet.getRow(i);
				XSSFCell cell=row.getCell(j);
				DataFormatter diff=new DataFormatter();
				String value=diff.formatCellValue(cell);
				data[i][j]=value;
			}
		}
		return data;
	}
}
