package testNg;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssert {
  @Test
  public void assertOrange() {
	  System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
	  WebDriver wd = new ChromeDriver();
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  wd.get("https://opensource-demo.orangehrmlive.com/");
	  
	  String ExpectedTile = "Orangehrm";// if there is no matching result then test will get fail
	  //String ExpectedTitle = "OrangeHRM"; // if there is matching result then test will get PASS
	  String ActualTilte = wd.getTitle();
	  
	  Assert.assertEquals(ActualTilte, ExpectedTile);
	  System.out.println("Actual Title of webpage====>" + ActualTilte);
	  
	  
  }
}
