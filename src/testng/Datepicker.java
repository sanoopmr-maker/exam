package testng;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
ChromeDriver driver;
String baseurl="https://www.expedia.co.in";
@BeforeTest
public void setup()
{
driver=new ChromeDriver();


}
@BeforeMethod
public void url()
{
driver.get(baseurl);
driver.manage().window().maximize();
}
@Test
public void test1()
{
	driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div[1]/div[2]/div/div/div/div")).click();
	while(true)
	{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
		String month1=month.getText();
		if(month1.equals("August 2023"))
		{
			System.out.println(month1);
			break;
		}
		else
		{
			
			driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/button[2]")).click();
		}
	}
		List<WebElement> alldays=driver.findElements(By.xpath("//*[@id=\"lodging_search_form\"]/div/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
		for(WebElement dayelement:alldays)
		{
			String day=dayelement.getAttribute("data-day");
			if(day.equals("16"))
			{
				dayelement.click();
				System.out.println("day selected:"+day);
			}
		}
		
		
	}
	
	
}



