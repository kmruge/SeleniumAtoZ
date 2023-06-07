package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vw {
	@Test()
	void hi()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//ul[@id=\"nav\"]//a[text()='Main Item 2']"))).build().perform();
	}
}