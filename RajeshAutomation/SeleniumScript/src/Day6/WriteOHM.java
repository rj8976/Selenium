package Day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WriteOHM {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://opensource-demo.orangehrmlive.com/");
		   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
		   FileInputStream fis = new FileInputStream("C:\\Selenium\\RajeshAutomation\\Book1.xlsx");
		   XSSFWorkbook wk = new XSSFWorkbook(fis);
		   XSSFSheet sh = wk.getSheet("WriteData");
		   
		   for(int i=1;i<=sh.getLastRowNum();i++)
		   {
			   XSSFRow rw = sh.getRow(i);
			   XSSFCell un = rw.getCell(0);
			   XSSFCell pw = rw.getCell(1);
			   XSSFCell res = rw.createCell(2);
			   
			   System.out.println("Username-->"+ un + "Password-->" + pw);
			   
			   wd.findElement(By.id("txtUsername")).sendKeys(un.toString());
			   wd.findElement(By.name("txtPassword")).sendKeys(pw.toString());
			   wd.findElement(By.className("button")).click();
			   
			   try 
			   {
				 wd.findElement(By.partialLinkText("Welcome")).click();
				 wd.findElement(By.linkText("Logout")).click();
				 System.out.println("Pass");
				 res.setCellValue("Pass");
			   }
			   
			   catch (Exception e)
			   {
				   System.out.println("Fail");
				   res.setCellValue("Fail");
				   TakesScreenshot ts = (TakesScreenshot)wd;
				   FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./" + un + ".png"));
			   }
			   }
		   fis.close();
		   FileOutputStream fos = new FileOutputStream("C:\\Selenium\\RajeshAutomation\\Book1.xlsx");
		   wk.write(fos);
		   

	}

}
	
