package in.rajesh.day3;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class DemoExtentReport {
	ExtentReports ext;
	ExtentTest tc1;
	WebDriver wd;
  @BeforeTest
  public void beforeTestrep() 
  {
	  ext = new ExtentReports();
	  ext.attachReporter(new ExtentHtmlReporter("report.html"));
	  tc1 = ext.createTest("Google Test");
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
	  wd = new ChromeDriver();
	  tc1.info("starting browser");
	  
  }
  @Test
  public void f() 
  {
	  wd.manage().window().maximize();
	  tc1.info("Maximize browser");
	  wd.get("https://www.google.com/");
	  tc1.info("Opening of URL");
	  if(wd.getTitle().equals("Google"))
	  {
		  tc1.log(Status.PASS,"Navigated Successfully");
	  }
	  else
	  {
		  tc1.log(Status.FAIL,"Unsuccessfull");
	  }
	  
  }
  @AfterTest
  public void clrep()
  {
	  tc1.info("Close browser");
	  wd.quit();
	  ext.flush();
	  
  }
  
}


