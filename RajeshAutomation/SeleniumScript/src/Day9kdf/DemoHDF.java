package Day9kdf;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Day8.OperationOHM_LoginPage;
import Day8.OperationOHM_LogoutPage;

public class DemoHDF {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver");
		WebDriver wd = new ChromeDriver();
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		FileInputStream fis = new FileInputStream("C:\\Selenium\\RajeshAutomation\\Book1.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fis);
		XSSFSheet sh = wk.getSheet("KeyOHM");
		
		OperationOHM_LoginPage olp = new OperationOHM_LoginPage(wd);
		OperationOHM_LogoutPage olg = new OperationOHM_LogoutPage(wd);
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow rw = sh.getRow(i);
			XSSFCell key = rw.getCell(1);
			System.out.println(key);
			
			switch (key.toString())
			{
			case "url":
				olp.url();
				break;
			case "username":
				olp.username("admin");
				break;
			case "password":
				olp.login();
				break;
			case "welcome":
				olg.welcome();
				break;
			case "logout":
				olg.logout();
				break;
			default:
				System.out.println("Invalid Keyword");

	}

		}
		System.out.println("valid");
		res.setCellValue("valid");
		
	}
	catch (Exception e)
	{
		System.out.println("Invalid");
		res.setCellValue("Invalid");
	}
}
   fis .close();
   FileOutputStream fos = new FileOutputStream("./ExcelBook.xlsx");
   wk write(fos);
		

