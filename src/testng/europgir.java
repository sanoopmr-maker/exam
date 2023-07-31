package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class europgir {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://europegirl.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/div/div/div/ul/li[2]/a")).click();
	}

}
