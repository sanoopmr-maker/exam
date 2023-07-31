package exam13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class exam14 {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.wappalyzer.com");
		
	}
	@Test
	public void Test() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-3156\"]")).click();
	}

}
