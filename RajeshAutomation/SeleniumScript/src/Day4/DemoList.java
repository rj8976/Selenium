package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoList {
	
	/*	List ---> To handle multiple element which have same property we have to group
	 * 			them together.List is an Interface of java.util pkg
	 * 
	 * 	findElements()--->find multiple elements which have same property.It 
	 * 			returns list of web element.Starts from 0 like Array
	 * 
	 */


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://opensource-demo.orangehrmlive.com/");
		   
		   wd.findElement(By.id("txtUsername")).sendKeys("admin");//id locator
		   wd.findElement(By.name("txtPassword")).sendKeys("admin123");//name locator
		   wd.findElement(By.className("button")).click();//class locator
		   
		   Actions act = new Actions(wd);
		   List<WebElement> menu = wd.findElements(By.className("firstLevelMenu")); 
		   System.out.println("Size of the menu -> " + menu.size() );
		   for(int i=0;i<menu.size();i++)
		   {
			   System.out.println(menu.get(i).getText());
			   act.moveToElement(menu.get(i)).perform();
			   
			   
		   }
		   
		   
	}

}
