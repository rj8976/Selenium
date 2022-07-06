package in.rajesh.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoFrame extends BaseClass {
  @Test
  public void ExFrame() 
  {
	  wd.get("https://www.globalsqa.com/demo-site/draganddrop/");
	  wd.switchTo().frame(wd.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
	  
	  WebElement drag1fromimage1 = wd.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
	  WebElement dropimageto = wd.findElement(By.xpath("//*[@id=\"trash\"]"));
	  
	  Actions builder = new Actions(wd);
	  Action drop1Image1 = builder.clickAndHold(drag1fromimage1)
			                      .moveToElement(dropimageto)
			                      .release(dropimageto)
			                      .build();
	  
	  drop1Image1.perform();
  }
}
