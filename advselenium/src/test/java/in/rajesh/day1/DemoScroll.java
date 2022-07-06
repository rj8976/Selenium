package in.rajesh.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoScroll extends BaseClass {
  @Test(description = "Handling Scroll Bar")
  public void scrollEx() throws Exception 
  {
	  wd.get("https://www.selenium.dev/downloads/");
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  //scroll to particular element
//	  WebElement e = wd.findElement(By.linkText("Chrome"));
//	  js.executeScript("arguments[0].scrollIntoView()",e);
	  //====================================================
		// scroll the document by the specified number of pixels
//		js.executeScript("window.scrollBy(0,2000)");//down	
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-1000)");//up	
		//======================================================
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//up
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//up	
		
		}
}
/*	Scrolling---> Selenium is unable to handle scrolling directly
 * 	Need to take the help of Javascript Executor to perform scrolling action
 * 	Javascript Executor can be used to run Javascript command
 * 	method executeScript() is used to run JavaScript command in selenium
 * 
 * 	Some methods JavaScriptExecutor which can perform scrolling
 * 	1]	scrollIntoView()--->scroll the page until mentioned elements is in full view
 * 	2]	scrollBy()---->scroll the document by specified number of pixels
 * 	3]	scrollTo()---->scroll the body of document till the height 
 * 
 */

