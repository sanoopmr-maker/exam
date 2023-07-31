package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class actions {
	ChromeDriver driver;
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
		
		
	}
	@BeforeMethod
	public void urlloading() throws InterruptedException
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(3000);
	}
	@Test
	public void test()
	{
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fname.sendKeys("priya");
		WebElement id=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		Actions act=new Actions(driver);	
		act.keyDown(fname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(id,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}
	
	
	

}
