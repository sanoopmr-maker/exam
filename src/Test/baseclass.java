package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseclass {
 WebDriver driver;
 @BeforeTest
 public void setup()
 {
 driver=new ChromeDriver();
 driver.get("https://simplysofas.in/");
 
 }
 @Test
 public void test() throws InterruptedException
 {
	// WebElement s=driver.findElement(By.xpath("/html/body/header/div/div[1]/div[3]/div/ul/li[2]"));
	// Actions a= new Actions(driver);
	 //a.moveToElement(s).perform();
	 //Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[1]/div/div[3]/div[1]/ul/li[3]/a")).click();
	 Thread.sleep(2000);
	// driver.findElement(By.xpath("//*[@id=\"
	 driver.findElement(By.xpath("//*[@id=\"loginemail\"]")).sendKeys("sanoopmr15@gmail.com");
	 WebElement t=driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
	 t.sendKeys("Sanoopmr@2001");
	 t.sendKeys(Keys.RETURN);
	 Thread.sleep(2000);
	 WebElement l=driver.findElement(By.xpath("//*[@id=\"wrap\"]/div[1]/div/div[3]/div[1]/ul/li[2]"));
	 l.click();
	 WebElement f=driver.findElement(By.xpath("//*[@id=\"myOverlay\"]/div[2]/form/input"));
       f.sendKeys("dining");
       f.sendKeys(Keys.RETURN);
       
	 
	

	 
	 
	 
	 
	 
	 
	
 }
 

}
