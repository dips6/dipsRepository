package testNgPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
  @Test
  public void x() {
	  
	  Reporter.log("X method from Demo3",true);
  }
  
  @Test
  public void y()  {
	  
	  Reporter.log("y method from Demo3",true);
	  
	  }
  
  @Test
  public void z() {
	   Reporter.log("z mthod from Demo3",true);
  }
}
