package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoxpath {
	 /*  	DisAdv---> It there are any changes made in aboslute path
	 *  		the xpath gets FAIL
	 *  
	 *  eg----> /html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input
	 *  
	 *  b]	relative xpath--->It starts from double forward slash[//] which
	 *  		means it can search webelement from anywhere on webpage
	 *  		Starts in between HTML DOM structure.Consise in sizes	
	 * 
	 * eg--->//*[@id='txtPassword']
	 */


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		   WebDriver wd = new ChromeDriver();
		   wd.get("https://opensource-demo.orangehrmlive.com/");
		   
		   //absolutepath
		   wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("admin");
		   //relativepath
		   wd.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		   //relative xpath by self
		   wd.findElement(By.xpath("input[@value='LOGIN']")).click();

	}

}
