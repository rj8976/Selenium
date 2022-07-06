package in.rajesh.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutePageFactory {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
	   WebDriver wd = new ChromeDriver();
	   wd.get("https://opensource-demo.orangehrmlive.com/");
	   PageFactoryOHM p = new PageFactoryOHM(wd);
	   p.username("admin");p.password("admin123");p.loginbtn();
  }
}
