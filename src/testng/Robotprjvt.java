package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Robotprjvt 
{
	ChromeDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
		
		@Test
		public void test() throws AWTException
		{
			driver.get("https://www.ilovepdf.com/merge_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileupload("‪‪C:\\Users\\sanoop mr\\Desktop");
		}
		
	public void	fileupload(String s)throws AWTException
	{
		StringSelection sele=new StringSelection(s);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sele,null);
		
	
	Robot robot=new Robot();
	robot.delay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	


		
	}
}
		
	
		
		
		
			
			
			
		

	
			
		
	
	


