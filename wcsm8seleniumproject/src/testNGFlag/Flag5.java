package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(description = "Login TestCase")
  public void login() 
  {
	  Reporter.log("login performed!!",true);
	  
  }
  
  @Test(description = "CreateUser TestCase",dependsOnMethods = "login")
  public void createUser()
  {
	  Reporter.log("user created!!",true); 
  }
  
  @Test(description = "logout TestCase",dependsOnMethods = "createUser",alwaysRun = true)
  public void logoutMethod()
  {
	  Reporter.log("logout performed!!",true);
  }
}
