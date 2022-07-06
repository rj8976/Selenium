package Day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("http://frontaccounting.squadinfotech.in/");
		   
		   wd.findElement(By.name("user_name_entry_field")).sendKeys("frontuser11");//name locator
		   wd.findElement(By.name("password")).sendKeys("frontuser11");//name locator
		   
		   Select s = new Select(wd.findElement(By.name("company_login_name")));//name locator
		   s.selectByVisibleText("Squad_MT_OL-50");// visible text locator
		   wd.findElement(By.name("SubmitUser")).click();//name locator
		   
		   wd.findElement(By.linkText("Direct Delivery")).click();//linktext locator
		   wd.findElement(By.id("CancelOrder")).click();
		   
		   Alert alt = wd.switchTo().alert();
		   System.out.println("Test alert ===>" + alt.getText());//capturetext
		   alt.accept();//click on ok button
		   //alt.dismiss();//click on cancel button
		   
		   
		   
		   

	}

}
