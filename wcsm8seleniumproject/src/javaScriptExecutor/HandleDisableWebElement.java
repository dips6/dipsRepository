package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the web application
		driver.get("file:///C:/Users/Vijay/Desktop/disabledelement.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
		driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//generate alert popup
		jse.executeScript("alert('Hello There!!');");
		
		//To handle disabled WebElement
		
		jse.executeScript("document.getElementById('i2').value='manager'");
		
	}

}
