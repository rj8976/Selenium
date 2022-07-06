package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TwoApp {
  @Test(groups = {"frontaccounting"})
  public void frontAccounting() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
	   WebDriver wd = new ChromeDriver();
	   wd.get("http://frontaccounting.squadinfotech.in/");
  }
  @Test(groups = {"blazedemo"})
  public void blazeDemo() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
	   WebDriver wd = new ChromeDriver();
	   wd.get("https://blazedemo.com/");
  
}
}
