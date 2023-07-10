package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDowncasting {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	//	Open Browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//launch the web application
	driver.get("https://www.facebook.com/");
	
	//by Downcasting to RemoteWebdriver class
	RemoteWebDriver rwd = (RemoteWebDriver)driver;
	File src = rwd.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshots/Facebook.png");
	Files.copy(src, dest);
	
}
}
