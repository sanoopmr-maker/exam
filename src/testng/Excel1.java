package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel1 {
    WebDriver driver;

    @BeforeTest
    public void beforetest() {
        
        driver = new ChromeDriver();
    }

    @Test
    public void testing() throws IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\sanoop mr\\Desktop\\exel.11.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(f);
        XSSFSheet sh = wb.getSheet("Sheet1");
        int rowCount = sh.getLastRowNum();
        for (int i = 1; i <= rowCount; i++) {
            String uname = sh.getRow(i).getCell(0).getStringCellValue();
            String pass = sh.getRow(i).getCell(1).getStringCellValue();
            System.out.println("username: " + uname);
            System.out.println("password: " + pass);
            driver.get("https://www.facebook.com");
            driver.findElement(By.id("email")).sendKeys(uname);
            driver.findElement(By.id("pass")).sendKeys(pass);
            driver.findElement(By.xpath("//*[@id=\"u_0_5_CN\"]")).click();
        }
        driver.quit();
    }
}


