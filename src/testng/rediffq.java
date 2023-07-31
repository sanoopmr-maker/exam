package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rediffq {
	ChromeDriver driver;
	@BeforeTest
	public void test1()
	{
	driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	}
	@BeforeMethod
	public void test0()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test2()
	{
		WebElement d=driver.findElement(By.xpath("//input[@value='m']"));
		boolean s=d.isSelected();
		System.out.println(s);
		
	} 
	Test
	public void
	

}
