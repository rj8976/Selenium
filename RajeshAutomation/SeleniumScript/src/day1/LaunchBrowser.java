package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Demo of launching browser & opening website
				//windows---->c:\\selenium\\Driver\\chromedriver.exe
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
				//setproperty()---->automates testcases on any browser
				//ChromeDriver c = new ChromeDriver();
				WebDriver wd = new ChromeDriver();//upcasting
				/*	Webdriver is an interface & all the method which are declared in webdriver Interface
				 * 	 are implemented by respective driver class.By implementing upcasting
				 * 	 Webdriver identify the browser on which test to be executed when script is
				 * 	 executed it will open website on specified browser using driver 
				 */
				wd.manage().window().maximize();//maximize current opened web browser
				wd.get("https://www.google.com/");//open URL & will wait till page is loaded
				
				String title = wd.getTitle();//is used to obtain title of present page
				System.out.println("Title of webpage---> " + title);
	}

}
