package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://blazedemo.com/");
		   
		   Select s = new Select(wd.findElement(By.name("fromPort")));
		   //s.selectByIndex(1);
		   //s.selectByValue("Boston");
		   s.selectByVisibleText("Mexico City");
		   
		   Select t = new Select(wd.findElement(By.name("toPort")));
		   //t.selectByIndex(1);
		   //t.selectByValue("London");
		   t.selectByVisibleText("Dublin");
		   
		   wd.findElement(By.cssSelector("input[type=submit]")).click();
		   
		   /*
		    * 	Dropdown---> To select on element from multiple elements of dropdown
		    * 		we use "Select" class.It is predefined class of selenium.support.ui package
		    * 		When <select> tag is preesnt in html source then it is 100% dropdown
		    * 
		    * 		There are some methods of select class to select 1 element from dropdown
		    * 
		    * 		1]	selectByIndex(int index) start from 0
		    * 		2]	selectByValue(String args)by using value of option tag
		    * 		3]	selectByVisibleText(String args)by using actual visible text of option
		    */

		   
	}

}
