package Day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallFAPOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("http://frontaccounting.squadinfotech.in/");
		   
		   OperationFA_LoginPage lpf = new OperationFA_LoginPage(wd);
		   OperationFA_Logout lgf = new OperationFA_Logout(wd);
		   lpf.loginProcess("frontuser11","frontuser11","Squad_MT_OL-50");
		   lgf.logoutProcess();


	}

}
