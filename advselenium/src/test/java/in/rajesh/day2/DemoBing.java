package in.rajesh.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoBing extends BaseClass
{
  @Test
  public void f() 
  {
	  wd.get(prop.getProperty("url"));
	  wd.findElement(By.xpath(prop.getProperty("searchfield"))).sendKeys("squad");
	  wd.findElement(By.xpath(prop.getProperty("searchfield"))).sendKeys(Keys.ENTER);
  }
}
