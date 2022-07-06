package Day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoScrShoot {
	
	/*	ScreenShot---> are desirable for bug analysis
	 * 	selenium can automatically take screenshot during execution
	 * 	by Typecasting WebDriver instance of TakesScreenShot
	 * 
	 * 
	 * 	TakesScreenshot ---- > Interface
	 * 	Webdriver---> Instance
	 * 
	 * 	getScreenShot--->Method
	 * 	Filehandler--->Class
	 */


	public static void main(String[] args) throws WebDriverException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://opensource-demo.orangehrmlive.com/");
		   
		   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
		   wd.findElement(By.id("txtUsername")).sendKeys("admin");//id locator
		   wd.findElement(By.name("txtPassword")).sendKeys("admin123");//name locator
		   wd.findElement(By.className("button")).click();//class locator
		   
		   TakesScreenshot ts = (TakesScreenshot)wd;
		   FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("./Shnsht.png"));

	}

}
