package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class newprjct{
WebDriver driver; 
By path1=By.xpath("//*[@id=\"user-name\"]");
By path3=By.xpath("//*[@id=\"password\"]");
By path4=By.xpath("//*[@id=\"login-button\"]");
By path5=By.xpath("//*[@id=\"item_4_title_link\"]/div");
By path6=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
By path11=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
By path12=By.xpath("//*[@id=\"checkout\"]");
By path7=By.xpath("//*[@id=\"first-name\"]");
By path8=By.xpath("//*[@id=\"last-name\"]");
By path9=By.xpath("//*[@id=\"postal-code\"]");
By path10=By.xpath("//*[@id=\"continue\"]");
By path13=By.xpath("//*[@id=\"continue\"]");
By path14=By.xpath("//*[@id=\"finish\"]");
By path15=By.xpath("//*[@id=\"back-to-products\"]");
By path16=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
By path18=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
By path19=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
By path20=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
By path21=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
By path22=By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
By path23=By.xpath("//*[@id=\"shopping_cart_container\"]/a");






	public newprjct(WebDriver driver)
	{
	this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void click()
	{
		//driver.findElement(path1).click();
		
		
	}
	public void setvalues(String email,String pass)
	{
		driver.findElement(path1).sendKeys(email);
		driver.findElement(path3).sendKeys(pass);
		//driver.findElement(path5).sendKeys(email);
		//driver.findElement(path6).sendKeys(password);
	}
	public void click1()
	{
	
		driver.findElement(path4).click();
	
		
	}
	public void click2()
	{
	
		driver.findElement(path5).click();
	}
	public void click3()
	{
		driver.findElement(path6).click();
	}
	public void click4()
	{
		driver.navigate().back();
	}
	public void click6()
	{
		driver.findElement(path11).click();
	}
	public void click7()
	
	{
		driver.findElement(path12).click();
		
	}
	public void setvaues1(String name,String lsname,String pin)
	{
		driver.findElement(path7).sendKeys(name);
		driver.findElement(path8).sendKeys(lsname);
		driver.findElement(path9).sendKeys(pin);
		
	}
public void click5()
{
	driver.findElement(path10);
	
	
}
	public void click8()
	{
		driver.findElement(path13).click();
	}
	public void click9()
	{
		driver.findElement(path14).click();
	}
	public void click10()
	{
		driver.findElement(path15).click();
		
	}
	public void click11()
	{
		driver.findElement(path16).click();
	}
	public void click12()
	{
		WebElement size= driver.findElement(path16);
		Select s=new Select(size);
		s.selectByValue("za");
		
	}
	public void click13()
	{
		driver.findElement(path18).click();
		driver.findElement(path19).click();
		driver.findElement(path20).click();
		driver.findElement(path21).click();
		driver.findElement(path22).click();
		driver.findElement(path23).click();
	}
	public void scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	


}
