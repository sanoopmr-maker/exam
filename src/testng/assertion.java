package testng;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class assertion {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	
	{
		driver=new ChromeDriver();

	}
	@Test
	public void test()
	{
    driver.get("https://www.facebook.com/");
    
    String actual=driver.getTitle();
    String expected="facebook";
	Assert.assertEquals(actual, expected);
	System.out.println("hello");

    		
	}

	}
	


