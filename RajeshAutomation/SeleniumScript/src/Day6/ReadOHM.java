package Day6;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadOHM {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://opensource-demo.orangehrmlive.com/");
		   
		   FileInputStream fis = new FileInputStream("C:\\Selenium\\RajeshAutomation\\Book1.xlsx");
		   XSSFWorkbook wk = new XSSFWorkbook(fis);
		   XSSFSheet sh = wk.getSheet("ReadData");
		   
		   for(int i=1;i<=sh.getLastRowNum();i++)
		   {
			   XSSFRow rw = sh.getRow(i);
			   XSSFCell un = rw.getCell(0);
			   XSSFCell pw = rw.getCell(1);
			   
			   System.out.println("Username-->"+ un + "Password-->" + pw);
			   
			   wd.findElement(By.id("txtUsername")).sendKeys(un.toString());
			   wd.findElement(By.name("txtPassword")).sendKeys(pw.toString());
			   wd.findElement(By.className("button")).click();
		   }
		   
		   
		   

	}

}
