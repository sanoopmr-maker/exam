package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softa {
	
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
	    SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual, expected);
		System.out.println("hello");

	    		
		}

		}
		




