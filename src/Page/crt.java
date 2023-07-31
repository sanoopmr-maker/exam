package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class crt  {
	WebDriver driver;
	By path1=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By path2=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	public crt(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues()
	{
		driver.findElement(path1).click();
		driver.findElement(path2).click();
	}
	

}
