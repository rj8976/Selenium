package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {
	WebDriver wd;
  @BeforeSuite
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
	  wd = new ChromeDriver();
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
  @BeforeClass
  public void loginProcess() {
	   wd.get("https://opensource-demo.orangehrmlive.com/");
	   wd.findElement(By.id("txtUsername")).sendKeys("admin");//id locator
	   wd.findElement(By.name("txtPassword")).sendKeys("admin123");//name locator
	   wd.findElement(By.className("button")).click();//class locator
  }

  @Test
  public void myinfo() {
	  wd.findElement(By.id("menu_pim_viewMyDetails")).click();
  }

  @Test
  public void pim() {
	  wd.findElement(By.id("menu_pim_viewPimModule")).click();
  }
  

  @AfterClass
  public void logoutProcess() {
	  wd.findElement(By.linkText("Welcome Paulinahzz")).click();
	  wd.findElement(By.linkText("Logout")).click();
	  
  }

  @AfterSuite
  public void closeBrowser() {
	  wd.quit();
  }


}
