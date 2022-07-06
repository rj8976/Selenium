package in.rajesh.day3;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CallOrangeProp {
	WebDriver wd;
  @Test
  public void f() throws Exception 
  {
	  Properties prop = new Properties();
	  prop.load(new FileInputStream("src\\test\\resources\\propertyFile\\Orange.property"));
	  
	  System.setProperty(prop.getProperty("chrkey"),prop.getProperty("cpath"));
	  wd = new ChromeDriver();
	  wd.get(prop.getProperty("url"));
	  getLocator(prop.getProperty("uname")).sendKeys(prop.getProperty("unamevalue"));
	  getLocator(prop.getProperty("pword")).sendKeys(prop.getProperty("pwordvalue"));
	  getLocator(prop.getProperty("login")).click();
	  
	  
  }
  public WebElement getLocator(String element) 
  {
	  WebElement e = null;
	  String locValue=element.split(":=")[0];
	  String locType=element.split(":=")[0];
	  
	  if(locType.equalsIgnoreCase("id"))
		  e=wd.findElement(By.id(locValue));
	  else if(locType.equalsIgnoreCase("name"))
		  e=wd.findElement(By.name(locValue));
	  else if(locType.equalsIgnoreCase("xpath"))
		  e=wd.findElement(By.xpath(locValue));
	  else if(locType.equalsIgnoreCase("cssSelector"))
		  e=wd.findElement(By.cssSelector(locValue));
	  else if(locType.equalsIgnoreCase("linkTest"))
		  e=wd.findElement(By.linkText(locValue));
	  return e;
	  
	  
	  
  }
}
