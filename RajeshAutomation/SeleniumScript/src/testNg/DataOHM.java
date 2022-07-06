package testNg;

import org.testng.annotations.Test;

import Day8.OperationOHM_LoginPage;
import Day8.OperationOHM_LogoutPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataOHM {
	private static final String pw = null;
	WebDriver wd;
	private String un;
	@BeforeTest
	public void beforetest()
	{
		 System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
		  WebDriver wd = new ChromeDriver();
		  
		  wd.get("https://opensource-demo.orangehrmlive.com/");
	}
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  OperationOHM_LoginPage ol = new OperationOHM_LoginPage(wd);
	  OperationOHM_LogoutPage op = new OperationOHM_LogoutPage(wd);
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  ol.loginProcess(un, pw);
	  try {
		  op.logoutProcess();
		  System.out.println("Valid");
	  }
	  catch (Exception e)
	  {
		  System.out.println("Invalid");
	  }
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { 2, "b" },
      new Object[] { "assa", "b" },
    };
  }
  @AfterTest
  public void aftertest() {
	  wd.quit();
	  
  }
}
