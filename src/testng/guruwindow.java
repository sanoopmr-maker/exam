package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class guruwindow {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		
	}
	@Test
	public void Test()
	{
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent tittle="+driver.getTitle());

		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String>allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sanoopmr13@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
			}
					
		}
				
		
	}

}
