package exam13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class exam15 {
		ChromeDriver driver;
		@BeforeMethod
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.yatra.com/support");
		}
		@Test
		public void test()  
		{
			List<WebElement> List1=driver.findElements(By.tagName("a"));
			System.out.println(List1.size());
			    
		}

}
