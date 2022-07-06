package in.rajesh.day4;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExGrid {
	WebDriver wd;
	@Parameters({"browser","node"})//arguments that are pass to the test method
	@BeforeTest
	public void beforeTest(String browser,String node) throws Exception
	{
		DesiredCapabilities dc;
		if(browser.equalsIgnoreCase("chrome"))
		{
			dc = DesiredCapabilities.chrome();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			dc = DesiredCapabilities.firefox();
		}
		else 
			dc = DesiredCapabilities.chrome();
		dc.setPlatform(Platform.WINDOWS);
		wd = new RemoteWebDriver(new URL(node),dc);
		System.out.println("Browser Name=" + browser);
	}
  @Test
  public void gridDemo() 
  {
	  wd.get("https://blazedemo.com/");
	  System.out.println("Title---->" + wd.getTitle());
  }
  @AfterTest
  public void afterTest()
  {
	  wd.quit();
  }
}
