package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
	//execute the annotations or methods according to priority
  @Test
  public void f() {
	  
	  Reporter.log("f method",true);
  }
  
  @Test
  public void a()
  {
	  Reporter.log("a method",true);
  }
  
  @Test(priority=-1)
  public void g()
  {
	  Reporter.log("g method",true);
  }
  
  @Test
  public void h()
  {
	  Reporter.log("h method",true);
  }
  
  @Test
  public void i()
  {
	  Reporter.log("i method",true);
  }
  
  @Test
  public void j()
  {
	  Reporter.log("j method",true);
  }
}
