package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrontAccounting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("http://frontaccounting.squadinfotech.in/");
		   
		   wd.findElement(By.name("user_name_entry_field")).sendKeys("frontuser11");//name locator
		   wd.findElement(By.name("password")).sendKeys("frontuser11");//name locator
		   
		   Select s = new Select(wd.findElement(By.name("company_login_name")));//name locator
		   s.selectByVisibleText("Squad_MT_OL-50");// visible text locator
		   wd.findElement(By.name("SubmitUser")).click();//name locator
		   wd.findElement(By.linkText("Logout")).click();//linktext locator
		   wd.findElement(By.linkText("Click here to Login Again.")).click();//linktext locator
		   
	}

}
