package TestNgPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data {
	RemoteWebDriver driver=null;
	dataPOM page=null;
	@BeforeClass()
	void callDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
	}
	@BeforeMethod()
	void driverClass()
	{
		page=new dataPOM(driver);
	}
	@Test()
	void run()
	{
		page.click();
		page.dateVerify("Apr","2024");
	}
}
