package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	
	//it is used to perform group execution
	
  @Test(groups="functional testing")
  public void ft1() {
	  Reporter.log("FTC1",true);
  }
  @Test(groups="")
}