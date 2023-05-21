package pageObjectModel;

import org.openqa.selenium.WebDriver;

public class BaseTest extends Flib implements IAutoConstant{
	static WebDriver driver;
	public void setUp() //open browser
	{
		Flib flib = new Flib();
		flib.readPropertyData();
	}

}
