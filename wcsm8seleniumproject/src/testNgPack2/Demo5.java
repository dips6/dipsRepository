package testNgPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {
  @Test
  public void p() {
	  
	  Reporter.log("p method from Demo5",true);
  }
  
  @Test
  public void q() {
	  
	  Reporter.log("q method from Demo5",true); 
  }
	  
	  @Test
	  public void r() {
		  int i=10;
		  int l=2;
		  int res=i/l;
		  
		  Reporter.log("r method from Demo5",true);
	  
  }
}
