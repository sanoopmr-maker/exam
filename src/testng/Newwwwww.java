package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newwwwww {WebDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.urbanladder.com/");

}
@Test
public void test() throws InterruptedException
{
	
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"header-icon-login\"]")).click();

	 driver.findElement(By.xpath("//*[@class=\"email required input_authentication\"]")).sendKeys("sanoopmr15@gmail.com");
	 WebElement t=driver.findElement(By.xpath("//*[@class=\"required input_authentication\"]"));
	 t.sendKeys("Sanoopmr@2001");
	 t.sendKeys(Keys.RETURN);
	 Thread.sleep(2000);
	WebElement s=driver.findElement(By.xpath("//*[@id=\"search\"]"));
	s.sendKeys("beanbags");
	s.sendKeys(Keys.RETURN);
	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[1]/a")).click();
	
	 
	
	 
       
	 
	

	 
	 
	 
	 
	 
	 
	
}


}



