package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page.crt;

public class createfb extends baseclass {

	@Test
	public void testing()
	{
		crt id=new crt(driver);
		id.setvalues();
		
	}
	
	
	
	

}
