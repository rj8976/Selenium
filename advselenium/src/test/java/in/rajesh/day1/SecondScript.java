package in.rajesh.day1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



import helper.BaseClass;

public class SecondScript extends BaseClass  {
  @Test
  public void rediffCheckbox() {
	  
	  wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  boolean sts = wd.findElement(By.id("remember")).isSelected();
	  Assert.assertEquals(sts,true);
  }
}
