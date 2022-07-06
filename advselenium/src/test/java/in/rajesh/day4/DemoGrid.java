package in.rajesh.day4;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoGrid {
	WebDriver wd;
  @Test
  public void gridExample() throws Exception 
  {
	  DesiredCapabilities dc = DesiredCapabilities.chrome();
	  dc.setPlatform(Platform.WINDOWS);
	  
	  wd = new RemoteWebDriver(new URL("http://192.168.0.108:4444/wd/hub"),dc);
	  
	  wd.get("https://blazedemo.com/");
	  System.out.println("Title---->" + wd.getTitle());
  }
}



