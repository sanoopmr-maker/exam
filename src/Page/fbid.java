package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbid {
	WebDriver driver;
	
	
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	
	public fbid(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void setvalues(String email,String password)
	
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
		
	}
	public void login()
	{
	driver.findElement(fblogin).click();
	}
	
	

}
