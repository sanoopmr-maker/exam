package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.newprjct;

public class project {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void testlogin() throws Exception
	{
	newprjct id=new newprjct(driver);
	//id.click();
	id.setvalues("standard_user", "secret_sauce");
	Thread.sleep(2000);
	id.click1();
	Thread.sleep(2000);
	id.click2();
	Thread.sleep(2000);
	id.click3();
	Thread.sleep(2000);
	id.click4();
	Thread.sleep(2000);
	id.click6();
	Thread.sleep(2000);
	id.click7();
	Thread.sleep(2000);
	id.setvaues1("sanoop"," mr", "680552");
	Thread.sleep(2000);
	id.click5();
	Thread.sleep(2000);
	id.click8();
	Thread.sleep(2000);
	id.click9();
	Thread.sleep(2000);
	id.click10();
	Thread.sleep(2000);
	id.click11();
	Thread.sleep(2000);
	id.click12();
	Thread.sleep(2000);
	
	id.click13();
	id.scroll();

}
}
