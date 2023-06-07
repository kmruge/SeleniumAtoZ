package Interview;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class caseStudy {
	
	@Test
	public void text() throws IOException
	{
		//WebDriver Manager
		WebDriverManager.chromedriver().setup();
		//Creating instance for chrome Driver
		ChromeDriver driver=new ChromeDriver();
		//To manage syschronization in webPafe I called Implicite Wait here
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Loading URL
		driver.get("https://www.flipkart.com/sony-zv-e10l-mirrorless-camera-body-1650-mm-power-zoom-lens-vlog/p/itmed07cbb694444?pid=DLLG6G8U8P2NGEHG&fm=neo%2Fmerchandising&ppt=dynamic&ppn=dynamic&ssid=ld5cb4xpfk0000001680956066201");
		//X-path for scraping Price
		String PriceDetail=driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]")).getText();
		//Creating FileWriter instace to write text in .txt file
		FileWriter file=new FileWriter("C:\\Users\\kmruge\\eclipse-workspace\\SeleniumAtoZ\\outPut\\outPut.txt",true);
		//Writing price detail in .txt file.
		file.write("Product Price  :"+PriceDetail+", ");
		//Performing click action tile the last reviews
		file.close();
	}
}