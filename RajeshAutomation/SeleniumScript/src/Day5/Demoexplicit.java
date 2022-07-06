package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoexplicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://opensource-demo.orangehrmlive.com/");
		   //tag id--->css---->tagname#valueofid
		   wd.findElement(By.id("txtUsername")).sendKeys("admin");//id locator
		   wd.findElement(By.name("txtPassword")).sendKeys("admin123");//name locator
		   wd.findElement(By.className("button")).click();//class locator
		   
		   WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(5));
		  
		   
		   wd.findElement(By.linkText("Welcome Paul")).click();//linktext locator
		   wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		   wd.findElement(By.linkText("Logout")).click();//linktext locator
		   
		   
		   /*		2 applications are interacting with each other
		    * 	a]	Selenium WebDriver-->which is firing script on AUT with constant speed
		    * 	b]	AUT-->which is reponding to the script with same speed
		    * 
		    * 		Sometimes AUT is not able to respond to the script in desired time
		    * 		This is called synchronisation issue between 2 applications.To handle
		    * 		this issue, we can use wait mechanism of selenium webdriver
		    * 
		    * 	Types of wait
		    * 	a]	Implicit Wait/Global wait---->It is applicable to all line of statement
		    * 		present in a script hence called as Global wait
		    * 		When complete time will exceed then it will throw exception
		    * 		It takes only required time for web element to get visible on webpage
		    * 		not complete time.
		    * 
		    * 	B]	Explicit Wait---->Applicable to particular line of statement in a script
		    * 		This wait is used to tell webdriver that wait for certain conditions
		    * 		i.e. expected conditions before throwing an exception if completed time
		    * 		period will exceed
		    */


	}

}
