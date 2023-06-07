package TestNgPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dataPOM {
	RemoteWebDriver driver=null;
	public dataPOM(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id=\"onward_cal\"]")
	WebElement ele;
	
	@FindBy(xpath="//table[@class=\"rb-monthTable first last\"]//td[@class=\"monthTitle\"]")
	WebElement dateget;
	@FindBy(xpath="//table[@class=\"rb-monthTable first last\"]//td[@class=\"next\"]")
	WebElement next;
//	@FindBy(xpath="//input[@id=\"txtOnwardCalendar\"]")
//	@FindBy(xpath="//input[@id=\"txtOnwardCalendar\"]")
	
	public void click()
	{
		ele.click();
	}
	public void dateVerify(String mon,String year)
	{
		while(true)
		{
			String date=dateget.getText();
			String[] arrDate=date.split(" ");
			if(arrDate[0].equals(mon)&&arrDate[1].equals(year))
			{
				break;
			}
			else
			{
				next.click();
			}
		}
	}
	
}
