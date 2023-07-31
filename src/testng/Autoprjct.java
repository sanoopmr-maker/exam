package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Autoprjct {
	ChromeDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		
	}
	@Test
	public void test() throws IOException
	{
		driver.get("https://www.ilovepdf.com/merge_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("‪C:\\celinium\\auto\\auto1.exe");
	}

}
