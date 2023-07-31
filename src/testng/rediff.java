package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rediff {
	ChromeDriver driver;


@BeforeTest
public void test1()
{
	driver=new ChromeDriver();
	}
@BeforeMethod
public void test2()

{
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	
	
}
@Test(groups="smoke" )
public void test3()
{
	WebElement d=driver.findElement(By.xpath("//input[@type='submit']"));
	boolean s=d.isEnabled();
	System.out.println(s);
	}
}
