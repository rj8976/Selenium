package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demomousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://opensource-demo.orangehrmlive.com/");
		   
		   wd.findElement(By.id("txtUsername")).sendKeys("admin");//id locator
		   wd.findElement(By.name("txtPassword")).sendKeys("admin123");//name locator
		   wd.findElement(By.className("button")).click();//class locator
		   
		   Actions act = new Actions(wd);
		   //act.moveToElement(wd.findElement(By.className("firstLevelMenu"))).perform(); 
		   act.moveToElement(wd.findElement(By.id("menu_Performance"))).perform();
		   
		   
		   /*	To handle special event of mouse & keyboard, we use an API "AdvancedUserInteractions"
		    * 		It contains 2 classes from selenium interactions pkg
		    * 		1]	Actions-->Capture single special event[perform()]
		    * 		2]	Action--->create series of special event[build()]
		    * 		moveToElement()--->of Actions class
		    * 			used to move the scope of cursor to middle of the element
		    */


	}

}
