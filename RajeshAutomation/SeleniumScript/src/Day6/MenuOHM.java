package Day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuOHM {

	public static void main(String[] args) throws Exception {
		 public void username(String un) 
		  {
			  uname.sendKeys(un);
		  }
		   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
		   FileInputStream fis = new FileInputStream("C:\\Selenium\\RajeshAutomation\\Book1.xlsx");
		   XSSFWorkbook wk = new XSSFWorkbook(fis);
		   XSSFSheet sh = wk.getSheet("Menu");
		   
		   wd.findElement(By.id("txtUsername")).sendKeys("admin");//id locator
		   wd.findElement(By.name("txtPassword")).sendKeys("admin123");//name locator
		   wd.findElement(By.className("button")).click();//class locator
		   
		   List<WebElement> allmenu = wd.findElements(By.className("firstLevelMenu"));
		   for (int i=0;i<allmenu.size();i++)
		   {
			   XSSFRow rw = sh.createRow(i);
			   XSSFCell res = rw.createCell(2);
			   System.out.println(allmenu.get(i).getText());
			   res.setCellValue(allmenu.get(i).getText());
		   }
		   
		   FileOutputStream fos = new FileOutputStream("C:\\Selenium\\RajeshAutomation\\Book1.xlsx");
		   wk.write(fos);

	}

}
