package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OperationOHM_LogoutPage {
	WebDriver wd;
	public OperationOHM_LogoutPage(WebDriver wd)
	{
		this.wd=wd;
	}
	//repository webelement
		By wcome = By.id("welcome");
		By lout = By.linkText("Logout");
		
		//method
		
		public void welcome() 
		{
			wd.findElement(wcome).click();
		}
		public void logout()
		{
			wd.findElement(lout).click();
		}
	
		public void logoutProcess()
		{
			welcome();
			logout();
		}
}

