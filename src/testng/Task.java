package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test() throws InterruptedException 
	{
	//WebElement e=	driver.findElement(By.xpath("//*[@id=\"terms\"]"));
	//boolean b=e.isSelected();
	//System.out.println(b);
	//Thread.sleep(3000);
	WebElement c=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	Thread.sleep(3000);
	c.sendKeys("‪‪‪‪‪C:\\Users\\sanoop mr\\Desktop\\Todays Home Work.txt");	
	}
}
