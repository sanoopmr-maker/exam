package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendedprjct {
	WebDriver driver;
	String baseurl1="https://www.facebook.com/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extents;
	@BeforeTest
	public void btest()
	{
		reporter=new ExtentHtmlReporter("./myreports/myreport1.html");
		reporter.config().setDocumentTitle("Automation Reports");
		reporter.config().setReportName("Functional test");
		reporter.config().setTheme(Theme.DARK);
		
		
		extents=new ExtentReports();
		extents.attachReporter(reporter);
		extents.setSystemInfo("hostname","localhost");
		extents.setSystemInfo("OS","window11");
		extents.setSystemInfo("tester name","sanoop");
		extents.setSystemInfo("Browser name","Chrome");
		
		driver=new ChromeDriver();}
		
		@BeforeMethod
		public void setup()
		{
			driver.get(baseurl1);
			
		}
		@Test
		public void fbtitleverification()
		{
			test=extents.createTest("fbtitleverification");
		
			String actual=driver.getTitle();
		    String expected="facebook";
			Assert.assertEquals(actual, expected);
			
			
		}
		AfterMethod
		
		
	}
	


