package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the web application
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		//perform scrolling operation
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		//scroll left
		jse.executeScript("window.scrollBy(-5000,0)");
	}

}
