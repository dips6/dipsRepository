package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	//to describe the method
	
  @Test(description= "This method performs Login!!")
  public void method1() {
	  
	 Reporter.log("Method 1 Login!!",true);
  }
}
