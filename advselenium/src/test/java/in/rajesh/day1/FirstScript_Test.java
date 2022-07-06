package in.rajesh.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import helper.BaseClass;

public class FirstScript_Test extends BaseClass
{
  @Test(description = "Print all values of dropdown")
  public void dropDownCheck() 
  {
	  wd.get("https://blazedemo.com/");
	  WebElement from = wd.findElement(By.name("fromPort"));
	  Select s = new Select(from);
	  List<WebElement> alloptions = s.getOptions();
	  for(int i=0;i<alloptions.size();i++) 
	  {
		  System.out.println(alloptions.get(i).getText());
	  }
	  
  }
}
