package testng;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class e {
	ChromeDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
	}
	@Test
	public void Test1() throws InterruptedException
	{
		WebElement d=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
				Actions a=new Actions(driver);
				a.moveToElement(d).perform();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click()
				
				;
				
	}

}


