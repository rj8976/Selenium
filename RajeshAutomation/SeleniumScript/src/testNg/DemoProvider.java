package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DemoProvider {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n + "" + s);
  }

  @DataProvider
  public Object[][] dp() {
	  
	 /*return type object with 2D array is mandtory
	  * first array representd set of data
	  * second array conatins parameter value
	  */
	  
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
