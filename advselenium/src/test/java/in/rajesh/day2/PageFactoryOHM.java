package in.rajesh.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFactoryOHM
{
	public PageFactoryOHM(WebDriver wd) 
	{
		PageFactory.initElements(wd, this);
	}
	// repository of webelement 
	@FindBy (id="txtUsername") WebElement uname;
	@FindBy (id="txtPassword") WebElement pword;
	@FindBy (id="btnLogin") WebElement login;
  @Test
  public void username(String un) 
  {
	  uname.sendKeys(un);
  }
  public void password(String pw) 
  {
	  pword.sendKeys(pw);
  }
  public void loginbtn() 
  {
	  login.click();
  }
  
}
