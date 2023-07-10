package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	//Method or Annotation is enabled or disabled
  @Test(enabled= true,description="Login Method")
  public void method1() {
	  
	  Reporter.log("Lgoin Performed!!");
  }
  
  @Test(enabled= true,description="Logout Method")
  public void method2()
  {
Reporter.log("Logout Performed");
  
}
}
