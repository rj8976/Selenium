package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OperationFA_Logout {
	
	 WebDriver wd;
	 
	 public OperationFA_Logout(WebDriver wd)
	 {
		 this.wd=wd;
	 }
	 //repository for webelements
	 
	 By logout = By.linkText("Logout");
	 By logAgain = By.linkText("Click here to Login Again.");
	 //method
	 
	 public void logoutlink() {
		 wd.findElement(logout).click();
	 }
	 public void clklogAgain()
	 {
		 wd.findElement(logAgain).clear(); 
	 }
	 public void logoutProcess()
	 {
		 logoutlink();
		 clklogAgain();
	 }
	}


