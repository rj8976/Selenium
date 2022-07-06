package day1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowser {
	static WebDriver wd;
	public static void main(String[] args) {
		// Accepting browser value from user
		// 1. Chrome
		// 2. Firefox
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.ChromeBrowser\n2.FirefoxBrowser");
		System.out.println("Choice");
		int ch = sc.nextInt();
		sc.close();
		switch (ch)
		{
		   case 1:
			   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
			   wd = new ChromeDriver();
			   break;
		   case 2: 
			   System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\driver\\geckodriver.exe");
			   wd = new FirefoxDriver();
			   break;
		}
		
			if(wd!=null)
			{
				wd.get("https://www.google.com/");
			}
		

	}

}
