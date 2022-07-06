package in.rajesh.day2;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileEg {
  @Test
  public void f() throws Exception 
  {
	  Properties prop = new Properties();
	  prop.load(new FileInputStream("src\\test\\resources\\propertyFile\\Demo.property"));
	  
	  String data = prop.getProperty("url");
	  System.out.println(data);
  }
}
