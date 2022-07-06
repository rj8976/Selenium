package helper;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	public WebDriver wd;
	public Properties prop;
	@BeforeTest
	public void beforeTest() throws Exception 
	{
		prop = new Properties();
		prop.load(new FileInputStream("src\\test\\resources\\propertyFile\\Demo.property"));
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("CHROME")) 
		{
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
			wd = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
			wd = new ChromeDriver();
		}
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		wd = new ChromeDriver();
	}
  @AfterTest
  public void afterTest() {
	  //wd.quit();
  }
}
