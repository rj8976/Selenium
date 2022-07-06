package Day8;

public class CallOHM {

	public static void main(String[] args) {
		{

			System.setProperty("webdriver.chrome.driver", "/home/luser/Desktop/Selenium/chromedriver");
			WebDriver wd = new ChromeDriver();
			wd.get("https://opensource-demo.orangehrmlive.com/");
			
			wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			OperationOHM_LoginPage lp  = new OperationOHM_LoginPage(wd);
			OperationOHM_LogoutPage lo = new OperationOHM_LogoutPage(wd);
			
			lp.loginProcess("admin", "admin123");
			lo.logoutProcess();

		}

	}

		

	}


