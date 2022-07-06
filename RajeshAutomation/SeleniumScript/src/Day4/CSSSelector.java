package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	
	/*	CSS--->cascading style sheet are used to create webpages in a stylish way
	 * 		hence can be effective medium to locate various webelements. These days
	 * 		webpages are designed dynamically.So its challenging to get unique
	 * 		id,name,classname to locate element.cssSelector can be alternative
	 * 		& faster way compared to another locators 
	 */


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://opensource-demo.orangehrmlive.com/");
		   //tag id--->css---->tagname#valueofid
		   wd.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		   //tag attribute--->css---->tagname[attribute=valueofattribute]
		   wd.findElement(By.cssSelector("input[type=password]")).sendKeys("admin123");
		   //tag classname--->css---->tagname.valueofclassname
		   wd.findElement(By.cssSelector("input.button")).click();
		  
		   
		   wd.findElement(By.linkText("Welcome hjhnhuhkjhkj")).click();
		   wd.findElement(By.linkText("Logout")).click();//linktext locator
		   
	}

}
